package com.coforge;

abstract class Payment {

    int amount;

    public Payment(int amount) {
		super();
		this.amount = amount;
	}

	abstract void pay();
    abstract void paymentReceipt();
}
