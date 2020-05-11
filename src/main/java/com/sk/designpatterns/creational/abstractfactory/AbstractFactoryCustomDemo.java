package com.sk.designpatterns.creational.abstractfactory;

public class AbstractFactoryCustomDemo {

	public static void main(String[] args) {
		CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(775);
		CreditCard card = creditCardFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card.getClass());

		creditCardFactory = CreditCardFactory.getCreditCardFactory(600);
		CreditCard card2 = creditCardFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card2.getClass());

	}

}
