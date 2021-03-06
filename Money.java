package code;

public class Money {
	
	private String currency;
	private double amount;
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Money(String currency,double amount) {
		this.currency=currency;
		this.amount=amount;
	}

	public boolean equals(Object obj) {
		if(obj == null)return false;
		if(obj.getClass() != this.getClass())return false;	
		Money r = (Money)obj;
		return this.currency.equals(r.getCurrency())&&this.amount==r.getAmount();
}
}

