package com.lfn.challengeconversordemodenas.principal;

import java.util.Scanner;
import com.lfn.challengeconversordemodenas.modelos.TipoMoneda;

/*
 * Ejecucion principal de la aplicacion
 */
public class principal {

	public static void main(String[] args) {
		
		String apiUrlExchangeRate = "https://v6.exchangerate-api.com/v6/88eed3b66dc80cc3ac33c607/latest/USD";
		String apiUrlOpenExcangeRates = "";
		String apiUrlCoinGecko = "";
		Scanner scanner = new Scanner(System.in);
        
		try {
			//Mensaje de bienvenida
			System.out.println("""
					****************************************************
					    Challenge Conversor de Monedas, Alura Latam
					      Por : Felipe Nieves => Grupo 7 Back End
					****************************************************
					""");
			
			String menu1 = "";
			while(!menu1.equals("s")) {
				//Menu 1
				System.out.println("""
					Ingrese el numero de la opcion de preferencia :
					c - Convertir moneda.
					h - Ver historial de conversiones.
					s - Salir.
					-----------------------------------------------------
					""");
				menu1 = scanner.nextLine();
				
				switch(menu1) {
					//Conversion
					case "c" :
						int menu2 = 0;
						while(menu2 != 4) {
							System.out.println("""
									Ingrese el numero del API de conversion de su gusto :
									1 - Exchage Rate.
									2 - Open Exchange Rates.
									3 - CoinGecko.
									4 - regresar.
									-----------------------------------------------------
									""");
							menu2 = scanner.nextInt();
							scanner.nextLine();
							switch(menu2) {
								//Exchage Rate.
								case 1 :
									System.out.println("""
										Ingrese el numero de la moneda a convertir (De:)
										-----------------------------------------------------
											""");
									for(TipoMoneda moneda : TipoMoneda.values()) {
										System.out.println(moneda);
									}
									System.out.println("""
										-----------------------------------------------------
											""");
									
								break;
								
								//Open Exchange Rates.
								case 2 :
								break;
								
								//CoinGecko.
								case 3 :
								break;
								
								//No valido.
								default :
									if(menu2 != 4) {
										System.out.println("Opción no válida. Por favor, intente de nuevo.");
									}
								break;
							}
						}
					break;
					
					//Historial
					case "h" :
					break;
					
					//Letra equivocada
					default:
						if(!menu1.equals("s")) {
							System.out.println("Opción no válida. Por favor, intente de nuevo.");
						}
		            break;
				}
			}
			
			scanner.close();
			System.out.println("""
					
					****************************************************
					        Gracias por usar este conversor.
					****************************************************
					""");
			
			
			/*
			
				
			//
			
			/*
        	//Conectar al api y obtener los datos
        	ClienteApi clienteApi = new ClienteApi();
        	String json = clienteApi.get(apiUrlExchangeRate);
        	
        	//Covertir Json en objecto
        	 AnalizarJson analizar = new AnalizarJson();
             ApiExchageRate apiExchangeRate = analizar.fromJson(json, ApiExchageRate.class);
        	
             //Mostrar informacion
        	System.out.println(apiExchangeRate.result());*/
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
