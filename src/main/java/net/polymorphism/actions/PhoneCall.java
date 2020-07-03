package net.polymorphism.actions;

public class PhoneCall  implements BillAction {
    double callCost;
    public PhoneCall(double price){
        if(price>0.0){
            callCost = price;
        }else {
            callCost = 0.00;
        }
    }

    @Override
    public double totalCost() {
        return callCost;
    }
}
