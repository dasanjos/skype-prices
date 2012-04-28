package com.dasanjos.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String home() {
		logger.info("requesting home");
		return "home";
	}

	@RequestMapping(value = "/view/{country}", method = RequestMethod.GET)
	public String view(@PathVariable String country) {
		logger.info("requesting /" + country);
		return "home";
	}
}
