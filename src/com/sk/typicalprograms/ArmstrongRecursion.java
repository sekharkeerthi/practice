package com.sk.typicalprograms;

class ArmstrongRecursion {

	static int findArmstrong(int n, int a, int length) {
		int x;
		if (n != 0) {
			x = n % 10;
			a = (int) (a + Math.pow(x, length));
			n /= 10;
			return findArmstrong(n, a, length);
		}
		return a;
	}

	public static void main(String[] arg) {
		int num = 153;
		int length = String.valueOf(num).length();
		int arm = ArmstrongRecursion.findArmstrong(num, 0, length);
		
		System.out.println((num == arm) ? "Armstrong Number" : "Not a Armstrong Number");
		
		/*System.out.println("Armstrong numbers between 1 to 1000");
		for (int num = 1; num < 500; num++) {
			arm = A.findArmstrong(num, 0);
			if (arm == num)
				System.out.println(num);
		}*/
	}
}