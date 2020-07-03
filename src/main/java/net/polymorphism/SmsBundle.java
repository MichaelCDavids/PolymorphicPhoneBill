package net.polymorphism;

class SmsBundle implements BillAction{
    int quantity;
    double smsPrice;
    public SmsBundle(int quantity, double smsPrice){
        this.quantity = quantity;
        this.smsPrice = smsPrice;
    }
    @Override
    public double totalCost() {
        return (quantity*smsPrice);
    }
}
