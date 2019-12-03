package com.sk.interview;

public class AddTwoNumbers {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		
		AddTwoNumbers at = new AddTwoNumbers();
		System.out.println(at.add(3, 5));
	}

}
