package com.lfn.challengeconversordemodenas.modelos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*
 * ClienteApi
 * Esta clase realizara el proceso de conectarse al api mediante el protocolo HTTP
 */
public class ClienteApi {
	public String get(String apiUrl) {
		try {
			//Conectarce
			HttpClient cliente = HttpClient.newHttpClient();
			HttpRequest solicitud = HttpRequest.newBuilder()
					.uri(URI.create(apiUrl))
					.build();
			
			//Leer respuesta
			HttpResponse<String> respuesta = cliente
					.send(solicitud, HttpResponse.BodyHandlers.ofString());
	
			//Retornar respuesta
			return respuesta.body();
		} catch (Exception e) {
			System.out.println("Error : no se pudo conectar al api, intente de nuevo");
			return "NO_CONEXION";
		}
	}
}
