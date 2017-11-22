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




public class Zhuce extends BaseTest{

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

	 @Test(dependsOnMethods="testLogin",dataProvider="s1",dataProviderClass=NSDataProvicer.class)
	 public void testAddMessage(String nickname,String email,String realName,String password,String repassword) throws InterruptedException {
			AddMassage add1=new AddMassage(webtest);
			add1.input(nickname, email, realName, password, repassword);
		}
	 @Test(dependsOnMethods="testAddMessage")
	 public void testAddAddress(String person,String province,String city,String county,String address2,String phone,String code) throws InterruptedException {
		 AddAddress add=new AddAddress(webtest);
		 add.input("majiashuo", "河北省", "衡水市", "深州市", "30号", "15732159232", "053800");
	 }
}
