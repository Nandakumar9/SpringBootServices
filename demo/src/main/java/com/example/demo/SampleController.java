package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sampletest")
public class SampleController {
	
	@GetMapping("/check")
	public String healthCheck() {
		return "Success";
	}

}
