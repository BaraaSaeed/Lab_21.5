/**
 * Copyright (c) 2019.
 * This program and the accompanying materials are made available
 * under my granted permission provided that this note is kept intact, unmodified and unchanged.
 * @ Author: Baraa Ali -  API and implementation.
 * All rights reserved.
*/

package co.grandcircus.Lab_21Half;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageResultController {

	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResult(@RequestParam("mpg") int mpg, @RequestParam("gallons") int gallons) {

		int remainingMiles = mpg * gallons;
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("mpg", mpg);
		mav.addObject("gallons", gallons);
		mav.addObject("remainingMiles", remainingMiles);
		return mav;
	}
}
