package test;

public class CardPament implements IPaymet {
	public CardPament() {
		System.out.println("CardPayment : constructor...");

	}

	@Override
	public void pay(double amt) {
		System.out.println("Paying bill amount Rs:" + amt + " using Card..");
		System.out.println("Thankyou...!!");
	}
		
		

	}


