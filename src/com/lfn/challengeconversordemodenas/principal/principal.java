package com.lfn.challengeconversordemodenas.principal;

import com.lfn.challengeconversordemodenas.modelos.*;

public class principal {

	public static void main(String[] args) {
		
		String apiUrlExchangeRate = "https://v6.exchangerate-api.com/v6/88eed3b66dc80cc3ac33c607/latest/USD";

        try {
        	//Conectar al api y obtener los datos
        	ClienteApi clienteApi = new ClienteApi();
        	String json = clienteApi.get(apiUrlExchangeRate);
        	
        	//Covertir Json en objecto
        	 AnalizarJson analizar = new AnalizarJson();
             ApiExchageRate apiExchangeRate = analizar.fromJson(json, ApiExchageRate.class);
        	
             //Mostrar informacion
        	System.out.println(apiExchangeRate.result());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
