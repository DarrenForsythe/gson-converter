package com.darrenforsythe.gsonconverter;

import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocaleController {

	@PatchMapping(path = "/mypath")
	public ResponseEntity<Void> updateLocale(@RequestBody Locale preferredLocale) {
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
