package com.sk.json;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, Integer> map = mapper.readValue("{" + "\"a\": 1," + "	\"b\": 2," + "	\"c\": 3" + "}", Map.class);

		System.out.println(map.get("c"));
	}

}
