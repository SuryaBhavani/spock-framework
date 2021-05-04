package com.suryabhavani.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@RequestMapping(value="/hai")
	public String welcome() {
		return "WELCOME!!";
	}
	@RequestMapping(value="/hello")
	public String goodbye() {
		return "GoodBye";
	}

}
