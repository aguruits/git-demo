package com.guru;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/getMessage")
	public String getMessage(){
		return "Hi Learner, Welcome to DevopsDemo Lab. Please continue you learnings";
	}
	
	@GetMapping("/message")
	public String message(){
		return "Hi Learner, Welcome to DevopsDemo Lab. This is testing message";
	}

}
