package com.lfn.challengeconversordemodenas.modelos;

import java.io.IOException;
import java.util.Scanner;

public class ManejadorMenu {
	
	private Scanner _scanner;
	private String _apiSeleccionada;
	
	public void setScanner(Scanner scanner) {
		this._scanner = scanner;
	}
	
	/*
	 * menuInicial
	 */
	public void menuInicial() throws IOException, InterruptedException {
		
		String opcion = "";
		
		while(!opcion.equals("s")) {
			System.out.println("""
				Ingrese el numero de la opcion de preferencia :
				c - Convertir moneda.
				h - Ver historial de conversiones.
				s - Salir.
				-----------------------------------------------------
				""");
			opcion = this._scanner.nextLine();
			switch(opcion) {
				//Conversion
				case "c" :
					this._menuApi();
				break;
				
				//Historial
				case "h" :
					
				break;
				
				//Letra equivocada
				default:
					if(!opcion.equals("s")) {
						System.out.println("Opción no válida. Por favor, intente de nuevo.");
					}
	            break;
			}
		}
	}
	
	/*
	 * _menuApi
	 */
	private void _menuApi() throws IOException, InterruptedException {
		
		int opcion = 0;
		
		while(opcion != 4) {
			System.out.println("""
					Ingrese el numero del API de conversion de su gusto :
					1 - Exchage Rate.
					2 - Open Exchange Rates.
					3 - CoinGecko.
					4 - regresar.
					-----------------------------------------------------
					""");
			opcion = this._scanner.nextInt();
			this._scanner.nextLine();
			this._apiSeleccionada = this._seleccionarApi(opcion);
			if(opcion == 1 || opcion == 2 || opcion == 3) {
				this._menuConversion();
			} else {
				if(opcion != 4) {
					System.out.println("Opción no válida. Por favor, intente de nuevo.");
				}
			}
		}
		
	}
	
	/*
	 * _menuConversion
	 */
	private void _menuConversion() throws IOException, InterruptedException {
		
		String monedaDe = "";
		String monedaA = "";
		double valor  = 0;
		boolean esDouble = false;
		boolean existeModedaDe = false;
		boolean existeModedaA = false;
	
		/*
		 * Moneda de
		 */
		System.out.println("""
				Ingrese abreviatura de la moneda de origen (De:)
				-----------------------------------------------------
					""");
		for(TipoMoneda moneda : TipoMoneda.values()) {
			System.out.println(moneda);
		}
		System.out.println("""
				-----------------------------------------------------
					""");
			
		while(!existeModedaDe) {
				monedaDe = this._scanner.nextLine();
				existeModedaDe = TipoMoneda.existeAbreviatura(monedaDe);
				if(!existeModedaDe) {
					System.out.println("Opción no válida. Por favor, intente de nuevo.");
				}
			}
			
		System.out.println("""
					Ingrese el valor a convertir :
					-----------------------------------------------------
						""");
		
		/*
		 * Valor a convertir
		 */
		while(!esDouble) {
			try {
				valor = this._scanner.nextDouble();
				this._scanner.nextLine();
				esDouble = true;
			} catch (Exception e) {
				System.out.println("Opción no válida. Por favor, intente de nuevo.");
				this._scanner.nextLine();
			}
		}
		
			
		/*
		 * Moneda a
		 */
		System.out.println("""
					Ingrese abreviatura de la moneda de destino (A:)
					-----------------------------------------------------
						""");
		for(TipoMoneda moneda : TipoMoneda.values()) {
					System.out.println(moneda);
		}
				System.out.println("""
					-----------------------------------------------------
						""");
			
		while(!existeModedaA) {
			monedaA = this._scanner.nextLine();
			existeModedaA = TipoMoneda.existeAbreviatura(monedaA);
			if(!existeModedaA) {
				System.out.println("Opción no válida. Por favor, intente de nuevo.");
			}
		}
		
		/*
		 * Convertir
		 */
		Conversor conversor = new Conversor(this._apiSeleccionada, monedaDe, monedaA, valor);
		conversor.convertir();	
	}
	
	/*
	 * _seleccionarApi
	 */
	private String _seleccionarApi(int opcion) {
		String api = "";
		if(opcion == 1) {
			api = "exchageRate";
		}
		
		if(opcion == 2) {
			api = "openExchangeRates";
		}
		
		if(opcion == 3) {
			api = "coinGecko";
		}
		return api;
	}
}
