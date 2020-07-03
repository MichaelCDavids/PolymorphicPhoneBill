package net.polymorphism;

public interface BillAction {
    double totalCost();
}

interface Call extends BillAction{
    void placeCall(double price);
}

interface Sms extends BillAction{
    void requestSmsBundle(int quantity, double price);
}

interface Data extends BillAction{
    void requestDataBundle(double price);
}
