package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvicer;

import manage.AddMassage;
import manage.LoginClass;

public class testEmail extends BaseTest{
	@Test
    public void testLogin() throws InterruptedException {
    	LoginClass add=new LoginClass(webtest);
    	add.inputValuesSeccess("majiashuo", "123456");
    }
	@Test(dependsOnMethods="testLogin",dataProvider="email",dataProviderClass=NSDataProvicer.class)
	 public void testAddMessage2(String nickname,String email,String realName,String password,String repassword) throws InterruptedException {
			AddMassage add1=new AddMassage(webtest);
			add1.input(nickname, email, realName, password, repassword);
		}
}
