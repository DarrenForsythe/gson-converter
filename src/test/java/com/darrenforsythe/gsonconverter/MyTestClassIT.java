package com.darrenforsythe.gsonconverter;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.google.gson.Gson;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class MyTestClassIT {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private Gson gson;

	@Test
	public void updateLocale() throws Exception {
		Locale locale = Locale.ITALIAN;
		mvc.perform(patch("/mypath").contentType(MediaType.APPLICATION_JSON).content(gson.toJson(locale)))
				.andExpect(status().isOk());
	}

}