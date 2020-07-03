package net.polymorphism.actions;

public class SmsBundle implements BillAction {
    int quantity;
    double smsPrice;
    public SmsBundle(int quantity, double smsPrice){
        if (quantity>0 & smsPrice>0.0){
            this.quantity = quantity;
            this.smsPrice = smsPrice;
        }else{
            this.quantity = 0;
            this.smsPrice = 0.00;
        }

    }
    @Override
    public double totalCost() {
        return quantity*smsPrice;
    }
}
