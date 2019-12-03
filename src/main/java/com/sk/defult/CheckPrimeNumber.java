package com.sk.defult;
import java.util.ArrayList;
import java.util.List;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		int num = 4;
		if (num == 1)
			System.out.println("Not a Prime");

		if (num == 2)
			System.out.println("Prime");

		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		if (flag)
			System.out.println("Prime");
		else
			System.out.println("Not a Prime");

		int n1 = 1;
		int n2 = 20;
		List<Integer> list = new ArrayList<>();
		for (; n1 <= n2; n1++) {
			boolean check = true;
			for (int j = 2; j <= n1 / 2; j++) {
				if (n1 % j == 0) {
					check = false;
				}
			}
			if (check)
				list.add(n1);
		}
		System.out.println(list);
	}

}
