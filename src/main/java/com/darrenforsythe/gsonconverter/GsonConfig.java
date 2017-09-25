package com.darrenforsythe.gsonconverter;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Configuration
public class GsonConfig {

	private static Gson GSON = generateStaticBuilder().create();

	private static GsonBuilder generateStaticBuilder() {
		return new GsonBuilder().registerTypeAdapter(Locale.class, new LocaleTwoWaySerializer())
				.enableComplexMapKeySerialization().setPrettyPrinting();
	}

	@Bean
	public Gson getGsonInstance() {
		return GSON;
	}

}