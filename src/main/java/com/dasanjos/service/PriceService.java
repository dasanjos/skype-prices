package com.dasanjos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dasanjos.model.Country;
import com.dasanjos.model.Destinations;
import com.dasanjos.model.Price;

@Service
public class PriceService {

	private static String LIVE_URL = "http://assets.skype.com/pricelist/1.0/json/en/skypeout/eur";

	private static String TEST_URL = "http://localhost:8080/skype-prices/resources/skypeout-eur.json";

	private static Destinations destinations;

	public PriceService() {
		// RestTemplate rest = new RestTemplate();
		// destinations = rest.getForObject(TEST_URL, Destinations.class);
		destinations = new Destinations();
		destinations.setCountries(new ArrayList<Country>());
		Country country = new Country();
		country.setCode("TT");
		country.setName("TEST");
		country.setPrices(new ArrayList<Price>());
		Price price = new Price();
		price.setName("TEST PRICE1");
		price.setPrice("2 internets");
		price.setPriceVat("3 internets");
		country.getPrices().add(price);
		Price price2 = new Price();
		price2.setName("TEST PRICE2");
		price2.setPrice("3 internets");
		price2.setPriceVat("4 internets");
		country.getPrices().add(price2);
		destinations.getCountries().add(country);
	}

	public List<Country> getCountries() {
		return destinations.getCountries();
	}

	public Country getCountry(String countryCode) {
		return destinations.getCountry(countryCode);
	}
}
