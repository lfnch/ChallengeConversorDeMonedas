package com.lfn.challengeconversordemodenas.modelos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ManejadorArchivo {
	private String _api;
	private String _monedaDe;
	private String _monedaA;
	private double _valor;
	private double _valorConversion;
	private File _file = new File("logs/logs.txt");	
	private Date _date = new Date();
	
	public void setDatosConversion(String api, String monedaDe, String monedaA, double valor, double valorConversion) {
		this._api = api;
		this._monedaDe = monedaDe;
		this._monedaA = monedaA;
		this._valor = valor;
		this._valorConversion = valorConversion;
	}
	
	public void leerArchivo() throws IOException {
		if(this._file.exists())
		{
			FileReader reader = new FileReader(this._file);

			int data = reader.read();
			
			System.out.print("Historia de conversiones.\n\n");
			
			while (data != -1) {
			    System.out.print((char) data);
			    data = reader.read();
			}
			System.out.print("\n-----------------------------------------------------\n");
			reader.close();
			
		} else {
			System.out.println("""
					No se encuentran registros disponibles.
					-----------------------------------------------------
					""");
		}
	}
	
	public void escribirEnArchivo() throws IOException {
		FileWriter writer = new FileWriter(this._file, true);
		writer.write(this._date + " => Api : " + 
		this._api + " " + this._valor + " " + 
		this._monedaDe + " EQUIVALE A : " + this._valorConversion + " " + this._monedaA + "\n");
		writer.close();
	}
}
