package net.polymorphism;

class SmsBundle extends PhoneBill{
    int quantity;
    double smsPrice;
    public SmsBundle(int quantity, double smsPrice){
        this.quantity = quantity;
        this.smsPrice = smsPrice;
    }
}
