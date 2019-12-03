package com.sk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MergingTwoListsById {

	public static void main(String[] args) {
		/*
		 * String homeDirectory = System.getProperty("user.home"); Process process =
		 * null; try { process = Runtime.getRuntime() .exec("cmd.exe"); } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * int exitCode = 0; try { exitCode = process.waitFor(); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } assert exitCode == 0;
		 */

		List<A1> l1 = new ArrayList<>();
		A1 a = new A1();
		a.setId(2);
		a.setName("Sekhar");
		l1.add(a);

		List<A1> l2 = new ArrayList<>();

		A1 aa = new A1();
		aa.setId(1);
		aa.setDesc("Keerthi");
		l2.add(aa);

		A1 aa1 = new A1();
		aa1.setId(2);
		aa1.setDesc("Jogi");
		l2.add(aa1);

		List<A1> completServersInfo = l1.stream().map((a1 -> {
			A1 matchingServer = l2.stream().filter(a2 -> a2.id.equals(a1.id)).findFirst().orElse(null);
			a1.setName(a1.getName());
			a1.setDesc(matchingServer.getDesc());
			return a1;
		})).collect(Collectors.toList());

		System.out.println(completServersInfo);

		/*
		 * Map<Integer, A> l1map = l1.stream().collect(Collectors.toMap(A::getId,
		 * Function.identity())); Map<Integer, A> l2Map =
		 * l2.stream().collect(Collectors.toMap(A::getId, Function.identity()));
		 * 
		 * l1map.keySet().forEach(key -> l1map.merge(key, l2Map.get(key), (a1, a2) -> {
		 * a1.setName(a1.getName()); a1.setDesc(a2.getDesc()); return a1; }));
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(l1map);
		 */

		/*
		 * Map<Integer, A> beforeMap = Maps.uniqueIndex(l1, new
		 * com.google.common.base.Function<A, Integer>() { public Integer apply(A a) {
		 * return a.getId(); } }); Map<Integer, A> afterMap = Maps.uniqueIndex(l2, new
		 * com.google.common.base.Function<A, Integer>() { public Integer apply(A a) {
		 * return a.getId(); } }); MapDifference<Integer, A> mapDiffrence =
		 * Maps.difference(beforeMap, afterMap);
		 * System.out.println(mapDiffrence.entriesDiffering());
		 */
	}

}