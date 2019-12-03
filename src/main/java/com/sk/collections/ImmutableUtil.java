package com.sk.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class ImmutableUtil {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Geeks");
		map.put(2, "For");
		map.put(3, "Geeks");
		map.put(3, null);

		System.out.println(Collections.unmodifiableMap(map));

		// Create ImmutableMap from Map using copyOf()
		ImmutableMap<Integer, String> immutableMap = ImmutableMap.copyOf(map);

		// Print the ImmutableMap
		System.out.println(immutableMap);

	}

}
