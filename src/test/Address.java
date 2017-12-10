package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvicer;

import manage.AddAddress;
import manage.DeleteAddress;

public class Address extends BaseTest{
	
	 @Test(dataProvider="s3",dataProviderClass=NSDataProvicer.class)

	 public void testAddAddress(String person,String province,String city,String county,String address2,String phone,String code) throws InterruptedException {
		AddAddress add=new AddAddress(webtest);
         add.input(person,province,city,county,address2,phone,code);
	 }
	 @Test
	 public void testDeleteAddress() {
		 DeleteAddress del=new DeleteAddress(webtest);
		 del.delete();
	 }
}
