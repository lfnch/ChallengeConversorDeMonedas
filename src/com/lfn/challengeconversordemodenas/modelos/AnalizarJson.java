package com.lfn.challengeconversordemodenas.modelos;
import com.google.gson.Gson;

/*
 * AnalizarJson
 * Es lo mismo de parsear el json para convertirlo en la clase que se pase de parametro
 * en este caso las clases tipo record para convertir segun cada api
 */
public class AnalizarJson {
	private Gson gson = new Gson();
	
	/*
	 * la T indica que recibe una clase generica, cualquier tipo de clase
	 * perro, persona, fruta etc.
	 */
	public <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }
}
