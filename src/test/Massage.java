package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvicer;

import manage.AddMassage;


public class Massage extends BaseTest{

	
	@Test(dataProvider="s1",dataProviderClass=NSDataProvicer.class)
	 public void testAddMessage(String nickname,String email,String realName,String password,String repassword) throws InterruptedException {
			AddMassage add1=new AddMassage(webtest);
			add1.input(nickname, email, realName, password, repassword);
		}
	 
}  
	 

