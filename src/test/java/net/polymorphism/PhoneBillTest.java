package net.polymorphism;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PhoneBillTest {
    @Test
    public void PhoneBillConstructorTest() {
        PhoneBill bill = new PhoneBill();
        assertTrue(bill instanceof PhoneBill);
    }
    @Test
    public void PhoneBillAcceptMethodTestData() {
        PhoneBill bill = new PhoneBill();

        bill.accept(new DataBundle(600));
        double cost = bill.totalCost();
        assertEquals(330.0, cost, 0.001);
    }
    @Test
    public void PhoneBillAcceptMethodTestSms() {
        PhoneBill bill = new PhoneBill();

        bill.accept(new SmsBundle(20,1.50));
        double cost = bill.totalCost();
        assertEquals(30.0, cost, 0.001);
    }
    @Test
    public void PhoneBillAcceptMethodTestCall() {
        PhoneBill bill = new PhoneBill();

        bill.accept(new PhoneCall(15.50));
        double cost = bill.totalCost();
        assertEquals(15.5, cost, 0.001);
    }
    @Test
    public void PhoneBillTotalCostMethod() {
        PhoneBill bill = new PhoneBill();
        bill.accept(new PhoneCall(15.50));
        bill.accept(new PhoneCall(25.50));
        bill.accept(new PhoneCall(150.50));
        bill.accept(new DataBundle(600));
        bill.accept(new DataBundle(600));
        bill.accept(new DataBundle(600));
        bill.accept(new SmsBundle(20,1.50));
        bill.accept(new SmsBundle(20,1.50));
        bill.accept(new SmsBundle(20,1.50));
        double cost = bill.totalCost();
        assertEquals(1271.50, cost, 0.001);
    }
    @Test
    public void DataBundleConstructorTest() {
        DataBundle dataBundle = new DataBundle(600);
        assertTrue(dataBundle instanceof DataBundle);
    }
    @Test
    public void DataBundleCostTest() {
        DataBundle dataBundle = new DataBundle(600);
        assertEquals((long)330.0,(long)dataBundle.dataCost);
        DataBundle dataBundle2 = new DataBundle(500);
        assertEquals((long)275.0,(long)dataBundle2.dataCost);
    }
    @Test
    public void PhoneCallConstructorTest() {
        PhoneCall call = new PhoneCall(2.55);
        assertTrue(call instanceof PhoneCall);
    }
    @Test
    public void PhoneCallCostTest() {
        PhoneCall call = new PhoneCall(10.0);
        double cost = call.callCost;
        assertEquals(10.0, cost, 0.01);
    }
    @Test
    public void SmsBundleConstructorTest() {
        SmsBundle smsBundle = new SmsBundle(10,0.65);
        assertTrue(smsBundle instanceof SmsBundle);
    }
}
