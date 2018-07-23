package test;

public class CashPay implements IPaymet {

	@Override
	public void pay(double amt) {
		System.out.println("Paying bill amount Rs:" + amt + " using Cashhh..");
		System.out.println("Thankyou...!!");
	}
	}


