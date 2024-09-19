package com.lfn.challengeconversordemodenas.modelos;

import java.io.IOException;

public class Conversor {
	private String _api;
	private String _monedaDe;
	private String _monedaA;
	private double _valor;
	
	Conversor(String api, String monedaDe, String monedaA, double valor) {
		this._api = api;
		this._monedaDe = monedaDe;
		this._monedaA = monedaA;
		this._valor = valor;
	}

	public void convertir() throws IOException  {
		String apiUrl = "";
		ApiExchageRate apiExchangeRate;
		ApiOpenExchangeRates apiOpenExchangesRates;
		ApiCoinGecko apiCoinGecko;
		ManejadorArchivo archivo = new ManejadorArchivo();
		double valorConversion = 0;
		
		System.out.println("Estado : Conectando con la api.");
		
		if(this._api == "exchageRate") {
			String idKey = "88eed3b66dc80cc3ac33c607";
			apiUrl = "https://v6.exchangerate-api.com/v6/" + idKey + "/pair/" + this._monedaDe + "/" + this._monedaA + "/" + this._valor;
		}
		
		if(this._api == "openExchangeRates") {
			String idKey = "2395d22fd3314112bf566cbc246819b8";
			apiUrl = "https://openexchangerates.org/api/latest.json?app_id=" + idKey;
		}
		
		if(this._api == "coinGecko") {
			/*Es para criptoMonedas */
			String idKey = "";
			//apiUrl = "https://pro-api.coingecko.com/api/v3/ping?x_cg_demo_api_key=" + idKey;
		}
		
		//Conectar al api y obtener los datos
		ClienteApi clienteApi = new ClienteApi();
		String json = clienteApi.get(apiUrl);
		
		if(!json.equals("NO_CONEXION")) {
			
			System.out.println("Estado : Analizando resultados.");
			//Covertir Json en objecto
			AnalizarJson analizar = new AnalizarJson();
			
			if(this._api == "exchageRate") {
				apiExchangeRate = analizar.fromJson(json, ApiExchageRate.class);
				valorConversion = apiExchangeRate.conversion_result();
			}
			
			if(this._api == "openExchangeRates") {
				apiOpenExchangesRates = analizar.fromJson(json, ApiOpenExchangeRates.class);
				double valorDolaresModenaDe = this._valor / apiOpenExchangesRates.getValor(this._monedaDe);
				valorConversion = apiOpenExchangesRates.getValor(this._monedaA) * valorDolaresModenaDe;
			}
			
			if(this._api == "coinGecko") {
				apiCoinGecko = analizar.fromJson(json, ApiCoinGecko.class);
			}
			
			System.out.println("Estado : Guardando registro.");
			//Guardar Registro
			archivo.setDatosConversion(this._api, this._monedaDe, this._monedaA, this._valor, valorConversion);
			archivo.escribirEnArchivo();
			
			System.out.println("Estado : Mostrando resultado.");
			//Imprimir resultado
			System.out.println("\n" + String.format("%.2f %s EQUIVALE A : %.2f %s", this._valor, this._monedaDe, valorConversion, this._monedaA));
			System.out.println("-----------------------------------------------------\n");
		}
	}   
}
