package com.example.Internatinalization;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViweController {
	
	@RequestMapping(value="/locale",method = RequestMethod.GET)
	
	public String locale() {
		return "hello";
	}

}
