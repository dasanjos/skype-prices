package com.dasanjos.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dasanjos.service.PriceService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	static Logger logger = Logger.getLogger(HomeController.class);

	@Autowired
	PriceService priceService;

	/**
	 * Return prices for all countries
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("countries", priceService.getCountries());
		logger.info("requesting home");
		return "home";
	}

	/**
	 * Return price for selected country if available
	 */
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public String view(@RequestParam(value = "country") String countryCode, Model model) {
		model.addAttribute("countries", priceService.getCountries());
		model.addAttribute("country", priceService.getCountry(countryCode));
		logger.info("requesting /country/" + countryCode);
		return "country";
	}
}
