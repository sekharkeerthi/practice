package com.sk.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StringCharOccurece {
	public static void main(String[] args) {
		String str[] = { "b", "a", "b", "c", "b", "a" };
		Map<String, Integer> counterMap = new TreeMap<>();
		for (String s : str) {
			if (counterMap.keySet().contains(s)) {
				counterMap.put(s, counterMap.get(s) + 1);
			} else {
				counterMap.put(s, 1);
			}
		}
		for (String key : counterMap.keySet()) {
			System.out.println("Character '" + key + "' occured in :" + counterMap.get(key) + " times");
		}

		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : counterMap.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}

		System.out.println(maxEntry.getKey() + " has higest occurences as " + maxEntry.getValue());

		// approach 2
		List<String> asList = Arrays.asList(str);
		Set<String> mySet = new TreeSet<String>(asList);
		for (String s : mySet) {
			System.out.println(s + " " + Collections.frequency(asList, s));
		}

		// approach 3 java 8
		Map<String, Long> map = Arrays.stream(str).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(map);

		Map.Entry<String, Long> mEntry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();

		System.out.println(mEntry.getKey() + " has higest occurences as " + mEntry.getValue());
	}
}
