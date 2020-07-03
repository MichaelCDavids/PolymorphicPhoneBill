package net.polymorphism;

import net.polymorphism.actions.DataBundle;
import net.polymorphism.actions.PhoneCall;
import net.polymorphism.actions.SmsBundle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Testing bill action implementations on classes:
 * PhoneCall
 * DataBundle
 * SmsBundle
 */
public class BillActionTest {


    @Test
    public void BillActionTotalsPhoneCallCostTest(){
        PhoneCall phoneCall = new PhoneCall(2.55);
        double cost = phoneCall.totalCost();
        assertEquals(2.55, cost, 0.001);
    }
    @Test
    public void BillActionTotalsPhoneCallCostOneHourTest(){
        PhoneCall phoneCall = new PhoneCall(140.00);
        double cost = phoneCall.totalCost();
        assertEquals(140.0, cost, 0.001);
    }
    @Test
    public void BillActionTotalsPhoneCallCostNegativeTest(){
        PhoneCall phoneCall = new PhoneCall(-2.55);
        double cost = phoneCall.totalCost();
        assertEquals(0.00, cost, 0.001);
    }
    @Test
    public void BillActionTotalsSmsBundleCostTest(){
        SmsBundle smsBundle = new SmsBundle(5,1.55);
        double cost = smsBundle.totalCost();
        assertEquals(7.75, cost, 0.001);
    }
    @Test
    public void BillActionTotalsSmsBundle10Sms2RandCostTest(){
        SmsBundle smsBundle = new SmsBundle(10,2.00);
        double cost = smsBundle.totalCost();
        assertEquals(20.00, cost, 0.001);
    }
    @Test
    public void BillActionTotalsDataBundleCostTest(){
        DataBundle dataBundle = new DataBundle(750);
        double cost = dataBundle.totalCost();
        assertEquals(412.50, cost, 0.001);
    }
    @Test
    public void BillActionTotalsDataBundleTest(){
        DataBundle dataBundle = new DataBundle(1024);
        double cost = dataBundle.totalCost();
        assertEquals(358.4, cost, 0.001);
    }
    @Test
    public void BillActionTotalsDataBundle2GBTest(){
        DataBundle dataBundle = new DataBundle(2048);
        double cost = dataBundle.totalCost();
        assertEquals(716.8, cost, 0.001);
    }
    @Test
    public void BillActionTotalsDataBundleCostNegativeTest(){
        DataBundle dataBundle = new DataBundle(-750);
        double cost = dataBundle.totalCost();
        assertEquals(0.00, cost, 0.001);
    }
    @Test
    public void BillActionTotalsDataBundleCostNegativeTestTwo(){
        DataBundle dataBundle = new DataBundle(-1550);
        double cost = dataBundle.totalCost();
        assertEquals(0.00, cost, 0.001);
    }
}
