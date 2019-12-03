package com.sk.string;

import java.util.ArrayList;
import java.util.List;

public class SplitStringByCamelCase {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 34; i++)
			list.add(i);
		System.out.println(splitList(list, 10));
	}

	public static <T> List<List<T>> splitList(List<T> ls, int iParts) {
		final List<List<T>> lsParts = new ArrayList<List<T>>();
		final int iChunkSize = ls.size() / iParts;
		int iLeftOver = ls.size() % iParts;
		int iTake = iChunkSize;

		for (int i = 0, iT = ls.size(); i < iT; i += iTake) {
			if (iLeftOver > 0) {
				iLeftOver--;

				iTake = iChunkSize + 1;
			} else {
				iTake = iChunkSize;
			}

			lsParts.add(new ArrayList<T>(ls.subList(i, Math.min(iT, i + iTake))));
		}

		return lsParts;
	}

}
