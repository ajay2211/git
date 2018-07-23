package test;
public class PhonPay implements IPaymet {

	@Override
	public void pay(double amt) {
		System.out.println("Paying bill amount Rs:" + amt + " using Phone pay.");
		System.out.println("Thankyou...!!");
	}
	}