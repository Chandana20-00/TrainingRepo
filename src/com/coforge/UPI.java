package com.coforge;

class UPI extends Payment {

    String upiId;
    String bankName;

    public UPI(int amount) {
		super(amount);
	}
    

	public UPI(int amount, String upiId, String bankName) {
		super(amount);
		this.upiId = upiId;
		this.bankName = bankName;
	}


    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }

    @Override
    void paymentReceipt() {
        System.out.println("Amount Paid: Rs " + amount);
        System.out.println("UPI ID is " + upiId);
        System.out.println("Bank Name is " + bankName);
    }
}

