package com.dasanjos.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	static Logger logger = Logger.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		RestTemplate rest = new RestTemplate();
		model.addAttribute("temp", rest.getForObject("http://assets.skype.com/pricelist/1.0/json/en/skypeout/eur", String.class));
		logger.info("requesting home");
		return "home";
	}

	@RequestMapping(value = "/view/{country}", method = RequestMethod.GET)
	public String view(@PathVariable String country, Model model) {
		logger.info("requesting /" + country);
		return "country";
	}
}
