package com.darrenforsythe.gsonconverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.gson.Gson;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	@ConditionalOnMissingBean
	@Autowired
	public GsonHttpMessageConverter gsonHttpMessageConverter(final Gson gson) {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		converter.setGson(gson);
		return converter;
	}
}