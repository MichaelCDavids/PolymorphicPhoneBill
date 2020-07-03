package net.polymorphism.actions;

public class PhoneCall  implements BillAction {
    double callCost;
    public PhoneCall(double price){
        callCost = price;
    }

    @Override
    public double totalCost() {
        return callCost;
    }
}
