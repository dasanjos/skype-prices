package com.dasanjos.model;

import java.util.List;

import org.springframework.util.StringUtils;

public class Destinations {

	private List<Country> countries;

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public Country getCountry(String countryCode) {
		if (StringUtils.hasText(countryCode)) {
			for (Country country : getCountries()) {
				if (countryCode.equals(country.getCode())) {
					return country;
				}
			}
		}
		return null;
	}
}
