package test;
public class DebittPay implements IPaymet {

	@Override
	public void pay(double amt) {
		System.out.println("Paying bill amount Rs:" + amt + " using debit..");
		System.out.println("Thankyou...!!");
	}
	}