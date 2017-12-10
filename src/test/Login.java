package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import manage.LoginClass;

public class Login extends BaseTest{
	@Test
	    public void testLogin() throws InterruptedException {
	    	LoginClass add=new LoginClass(webtest);
	    	add.inputValuesSeccess("majiashuo", "123456");
	    }
}
