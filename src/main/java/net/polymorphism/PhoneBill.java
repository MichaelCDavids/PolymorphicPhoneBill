package net.polymorphism;

public class PhoneBill{
    double total;

    public void accept(BillAction billAction){
       total += billAction.totalCost();
    }

    public double totalCost() {
        return this.total;
    }
}

