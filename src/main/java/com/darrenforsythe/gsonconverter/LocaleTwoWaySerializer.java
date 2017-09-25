package com.darrenforsythe.gsonconverter;

import java.lang.reflect.Type;
import java.util.Locale;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LocaleTwoWaySerializer implements JsonSerializer<Locale>, JsonDeserializer<Locale> {

	public JsonElement serialize(final Locale src, final Type typeOfSrc, final JsonSerializationContext context) {
		return src == null ? JsonNull.INSTANCE : new JsonPrimitive(src.getLanguage());
	}

	public Locale deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) {
		return json == null || JsonNull.INSTANCE.equals(json) ? null : new Locale(json.getAsString());
	}
}