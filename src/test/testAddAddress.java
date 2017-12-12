package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvicer;

import manage.AddAddress;
import manage.LoginClass;

public class testAddAddress extends BaseTest{
	@Test
    public void testLogin() throws InterruptedException {
    	LoginClass add=new LoginClass(webtest);
    	add.inputValuesSeccess("majiashuo", "123456");
    }
	 @Test(dependsOnMethods="testLogin",dataProvider="s3",dataProviderClass=NSDataProvicer.class)

	 public void testAddAddresses(String person,String province,String city,String county,String address2,String phone,String code) throws InterruptedException {
		AddAddress add=new AddAddress(webtest);
         add.input(person,province,city,county,address2,phone,code);
	 }
}
