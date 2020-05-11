package com.sk.designpatterns.abstractfactory;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
	
			case PLATINUM:
				return new AmexPlatinumCreditCard();
	
			default:
				break;
			}
		return null;
	}

	@Override
	public Vaidator getVaidator(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new AmexGoldValidator();
	
			case PLATINUM:
				return new AmexPlatinumValidator();
	
			default:
				break;
			}
		return null;
	}

}
