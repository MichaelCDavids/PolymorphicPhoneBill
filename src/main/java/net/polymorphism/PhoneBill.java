package net.polymorphism;

import net.polymorphism.actions.BillAction;

public class PhoneBill{
    double total;

    public void accept(BillAction billAction){
       total += billAction.totalCost();
    }

    public double totalCost() {
        return this.total;
    }
}

