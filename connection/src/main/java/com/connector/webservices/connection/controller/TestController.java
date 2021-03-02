package com.connector.webservices.connection.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String testOk() {
		return "OK";
	}

	@PostMapping("/addition")
	public Map<String,Object> addition(@RequestParam Integer xx ) {
		Map<String,Object> response = new HashMap<>();
		int k= xx+5;
		response.put("status", "OK");
		response.put("result", k);
		return response;
	}
}
