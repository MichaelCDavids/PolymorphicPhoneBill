package net.polymorphism.actions;

public class DataBundle implements BillAction {
    double dataCost;

    public DataBundle(int megabytes){
        updateCost(megabytes);
    }

    private void updateCost(int megabytes){
        if (megabytes>=1000){
            dataCost = (megabytes*0.35);
        }else if (megabytes>=500){
            dataCost = (megabytes*0.55);
        }else if(megabytes<500 && megabytes>0){
            dataCost = (megabytes*0.75);
        }else {
            dataCost = 0.0;
        }
    }

    @Override
    public double totalCost() {
        return this.dataCost;
    }
}
