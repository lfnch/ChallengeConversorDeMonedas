package com.lfn.challengeconversordemodenas.modelos;

import java.util.Map;

/*
 * ApiOpenExchangeRates
 * clase para usar la api OPEN EXCHANGE RATES
 * https://openexchangerates.org/
 */
public record ApiOpenExchangeRates(
		String disclaimer,
		String license,
		String timestamp,
		String base,
		Map<String, Double> rates
		) {
	
	public double getValor(String abreviatura) {
		for (Map.Entry<String, Double> moneda : rates.entrySet()) {
			if(moneda.getKey().equals(abreviatura)) {
				return moneda.getValue();
			}
		}
		return 0;
	}
}

