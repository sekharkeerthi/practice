package com.sk.designpatterns.abstractfactory;

//Abstract Product
public abstract class CreditCard {

	protected int cardNumLength;

	protected int cscNumber;

	public int getCardNumLength() {
		return cardNumLength;
	}

	public void setCardNumLength(int cardNumLength) {
		this.cardNumLength = cardNumLength;
	}

	public int getCscNumber() {
		return cscNumber;
	}

	public void setCscNumber(int cscNumber) {
		this.cscNumber = cscNumber;
	}

}
