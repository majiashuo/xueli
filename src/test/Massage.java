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
//	 @Test(dependsOnMethods="testLogin",dataProvider="s3",dataProviderClass=NSDataProvicer.class)
	 @Test(dependsOnMethods="testLogin")
//	 public void testAddAddress(String person,String province,String city,String county,String address2,String phone,String code) throws InterruptedException {
	 public void testAddAddress() throws InterruptedException {
		 AddAddress add=new AddAddress(webtest);
		 add.input("马佳烁11", "浙江省", "杭州市", "临安市", "40号", "18323145678", "123456");
//		 add.input(person,province,city,county,address2,phone,code);
	 }
	 
}
