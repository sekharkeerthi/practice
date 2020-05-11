package com.sk.designpatterns.abstractfactory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldCreditCard();

		case PLATINUM:
			return new VisaPlatinumCreditCard();

		default:
			break;
		}
		return null;
	}

	@Override
	public Vaidator getVaidator(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new VisaGoldValidator();
	
			case PLATINUM:
				return new VisaPlatinumValidator();
	
			default:
				break;
			}
		return null;
	}

}
