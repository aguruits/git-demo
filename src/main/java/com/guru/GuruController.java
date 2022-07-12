package com.guru;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuruController {
	
	@GetMapping("/getNewMessage")
	public String getMessage(){
		return "Hi Guru, Welcome to DevopsDemo Lab. Please continue you learnings";
	}
	
}
