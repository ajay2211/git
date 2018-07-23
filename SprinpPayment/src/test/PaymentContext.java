package test;

public class PaymentContext {
	public PaymentContext() {

	System.out.println("PaymentContext: constructor executed...");
}

private IPaymet payment;

public void setPayment(IPaymet payment) {
	this.payment = payment;
}

public void pay(double amt) {
	payment.pay(amt);
}

}
