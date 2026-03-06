package com.coforge;

public class PaymentMain {

    public static void main(String[] args) {

        Payment p1 = new Card(2000,4874, 277, "28/1/26");
        p1.pay();
        p1.paymentReceipt();

        System.out.println();

        Payment p2 = new UPI(3000,"123@paytm", "SBI");
        p2.pay();
        p2.paymentReceipt();

        System.out.println();

        Payment p3 = new Wallet(4000,9876543210L, "HDFC");
        p3.pay();
        p3.paymentReceipt();
    }
}