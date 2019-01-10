package com.dxc.appl.demo.k8shello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping(path="hello")
	public String answer() {
		return "TEST";
	}
}
