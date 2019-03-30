package com.spk.sbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	BuildProperties buildProperties;

	@GetMapping("home")
	public BuildProperties home() {
		return buildProperties;
	}

}
