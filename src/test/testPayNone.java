package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import manage.LoginClass;
import manage.Pay;

public class testPayNone extends BaseTest{
	@Test
    public void testLogin() throws InterruptedException {
    	LoginClass add=new LoginClass(webtest);
    	add.inputValuesSeccess("majiashuo", "123456");
    }
	@Test(dependsOnMethods="testLogin")
	 public void testPayNones() throws InterruptedException {
		 Pay pay=new Pay(webtest);
		
		 pay.payNone();
		
	 }
}
