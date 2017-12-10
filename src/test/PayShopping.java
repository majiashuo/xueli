package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import manage.Pay;

public class PayShopping extends BaseTest{
	
	 @Test
	 public void testPay() throws InterruptedException {
		 Pay pay=new Pay(webtest);
		 pay.pay(1);
		 pay.payNone();
		 pay.payAll();
	 }
}
