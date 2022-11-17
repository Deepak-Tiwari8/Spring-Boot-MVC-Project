package com.javatech.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("Welcome window");
		return "index";
	}
}
