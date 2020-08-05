package com.sk.java8;

public class AdapterClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	interface I1 {
		void m1();
	}

	interface I2 {
		void m2();

		void m3();
	}

	abstract class AdapterI1I2Impl implements I1, I2 {
		public void m1() {
		}

		public void m2() {
		}

		public void m3() {
		}
	}

	class A extends AdapterI1I2Impl {

		@Override
		public void m1() {
			// TODO Auto-generated method stub

		}

		@Override
		public void m2() {
			// TODO Auto-generated method stub

		}
	}

	class B extends AdapterI1I2Impl {

		@Override
		public void m1() {
			// TODO Auto-generated method stub

		}

		@Override
		public void m2() {
			// TODO Auto-generated method stub

		}
	}
}
