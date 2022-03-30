package com.sk.string;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacterInString {

	public static void main(String[] args) {
		String s = "sekharkeerthi";
		List<Character> list = s.chars().mapToObj(c -> Character.toLowerCase((char) c))
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1L).map(e -> e.getKey()).collect(Collectors.toList());

		System.out.println(list);

		List<Character> list2 = s.chars().mapToObj(c -> Character.toLowerCase((char) c))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1L).map(e -> e.getKey()).collect(Collectors.toList());

		System.out.println(list2);
	}

}
