package com.lfn.challengeconversordemodenas.modelos;
import com.google.gson.Gson;

public class AnalizarJson {
	private Gson gson = new Gson();
	
	public <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }
}
