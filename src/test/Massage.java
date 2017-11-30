package test;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvicer;

import listener.WebtestListener;
import manage.AddAddress;
import manage.AddMassage;
import manage.AddShopping;
import manage.DeleteAddress;
import manage.DeleteShopping;
import manage.LoginClass;


public class Massage extends BaseTest{

	@BeforeSuite
	public void addListener(ITestContext context)throws Exception {
		TestRunner runner = (TestRunner) context;
		
	    runner.addListener(new WebtestListener());
	   
	}
	 @Test
	    public void testLogin() throws InterruptedException {
	    	LoginClass add=new LoginClass(webtest);
	    	add.inputValuesSeccess("majiashuo", "123456");
	    	
	    }

//	 @Test(dependsOnMethods="testLogin",dataProvider="s1",dataProviderClass=NSDataProvicer.class)
//	 public void testAddMessage(String nickname,String email,String realName,String password,String repassword) throws InterruptedException {
//			AddMassage add1=new AddMassage(webtest);
//			add1.input(nickname, email, realName, password, repassword);
//		}
//	 @Test(dependsOnMethods="testAddMessage",dataProvider="s3",dataProviderClass=NSDataProvicer.class)
//
//	 public void testAddAddress(String person,String province,String city,String county,String address2,String phone,String code) throws InterruptedException {
//		 AddAddress add=new AddAddress(webtest);
//         add.input(person,province,city,county,address2,phone,code);
//	 }
//	 @Test(dependsOnMethods="testAddAddress")
//	 public void testDeleteAddress() {
//		 DeleteAddress del=new DeleteAddress(webtest);
//		 del.delete();
//	 }
//	 @Test(dependsOnMethods="testLogin")
//	 public void testAddShopping() throws InterruptedException {
//			AddShopping add2=new AddShopping(webtest);
//			add2.addgoods();
//		}
	 @Test(dependsOnMethods="testLogin")
	 public void testDeleteShopping() throws InterruptedException {
		 DeleteShopping del=new DeleteShopping(webtest);
		 del.delete();
	 }
	 
}
