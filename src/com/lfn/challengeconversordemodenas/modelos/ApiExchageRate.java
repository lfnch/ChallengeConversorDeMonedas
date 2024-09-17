package com.lfn.challengeconversordemodenas.modelos;

import java.util.Map;

/*
 * ApiExchageRate
 * clase para usar la api EXCHANGE RATE
 * https://app.exchangerate-api.com/
 */
public record ApiExchageRate (
		String result,
		String documentation,
		String terms_of_use,
		int time_last_update_unix,
		String time_last_update_utc,
		int time_next_update_unix,
		String time_next_update_utc,
		String base_code,
		Map<String, Double> conversion_rates
		) {
}