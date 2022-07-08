package com.guru;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/message")
	public String getOrders(){
		return "Hi Learner, Welcome to GitHub Demo Lab....";
	}


}
