package com.lfn.challengeconversordemodenas.principal;

import java.util.Scanner;

import com.lfn.challengeconversordemodenas.modelos.ManejadorMenu;

/*
 * Ejecucion principal de la aplicacion
 */
public class principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ManejadorMenu menu = new ManejadorMenu();
		
		try {
			_encabezadoPrograma();
			menu.setScanner(scanner);
			menu.menuInicial();
			scanner.close();
			_piePaginaProgama();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private static void _encabezadoPrograma() {
		System.out.println("""
				****************************************************
				    Challenge Conversor de Monedas, Alura Latam
				      Por : Felipe Nieves => Grupo 7 Back End
				****************************************************
				""");
	}
	
	private static void _piePaginaProgama() {
		System.out.println("""
				
				****************************************************
				        Gracias por usar este conversor.
				****************************************************
				""");
	}
}
