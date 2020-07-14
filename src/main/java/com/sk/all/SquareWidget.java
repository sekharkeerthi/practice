package com.sk.all;

abstract class Widget {
	private final int cachedWidth;
	private final int cachedHeight;

	public Widget() {
		this.cachedWidth = width();
		this.cachedHeight = height();
	}

	protected abstract int width();

	protected abstract int height();
}

public class SquareWidget extends Widget {
	private final int size;

	public SquareWidget(int size) {
		this.size = size;
	}

	@Override
	protected int width() {
		return size;
	}

	@Override
	protected int height() {
		return size;
	}

	public static void main(String[] args) {
		SquareWidget w = new SquareWidget(10);
		System.out.println(w.height() + ":" + w.width());
	}
}