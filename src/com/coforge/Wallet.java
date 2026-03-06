package com.coforge;

class Wallet extends Payment {

    long mobileNumber;
    String bankName;

    public Wallet(int amount) {
		super(amount);
	}

	public Wallet(int amount, long mobileNumber, String bankName) {
		super(amount);
		this.mobileNumber = mobileNumber;
		this.bankName = bankName;
	}

    @Override
    void pay() {
        System.out.println("Payment done using Wallet");
    }

    @Override
    void paymentReceipt() {
        System.out.println("Amount Paid: Rs " + amount);
        System.out.println("Mobile Number is " + mobileNumber);
        System.out.println("Bank Name is " + bankName);
    }
}
