package com.coforge;

class Card extends Payment {

    long cardNo;
    int cvv;
    String expDate;

    public Card(int amount) {
		super(amount);
	}

	public Card(int amount, long cardNo, int cvv, String expDate) {
		super(amount);
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expDate = expDate;
	}

	
    @Override
    void pay() {
        System.out.println("Payment done using Card");
    }

    @Override
    void paymentReceipt() {
    	System.out.println("Amount Paid: Rs " + amount);
        System.out.println("Card No is " + cardNo);
    }
}
