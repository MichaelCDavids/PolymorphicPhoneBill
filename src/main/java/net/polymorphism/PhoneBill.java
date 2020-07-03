package net.polymorphism;

public class PhoneBill implements BillAction, Call, Sms, Data {
    double total;

    public void accept(BillAction billAction){
        if (billAction instanceof PhoneCall){
            placeCall(((PhoneCall) billAction).callCost);
        }else if(billAction instanceof SmsBundle){
            requestSmsBundle(((SmsBundle) billAction).quantity,((SmsBundle) billAction).smsPrice);
        }else if(billAction instanceof DataBundle){
            requestDataBundle(((DataBundle) billAction).dataCost);
        }else {
            System.out.println("Product Not Found");
        }
    }

    @Override
    public double totalCost() {
        return this.total;
    }

    @Override
    public void placeCall(double price) {
        total += price;
    }

    @Override
    public void requestSmsBundle(int quantity, double price) {
        total += (quantity*price);
    }

    @Override
    public void requestDataBundle(double price) {
        total += price;
    }
}

