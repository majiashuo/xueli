package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import manage.DeleteShopping;
import manage.LoginClass;

public class testDeleteShopping extends BaseTest{
	@Test
    public void testLogin() throws InterruptedException {
    	LoginClass add=new LoginClass(webtest);
    	add.inputValuesSeccess("majiashuo", "123456");
    }
	@Test(dependsOnMethods="testLogin")
	public void testDeleteShoppings() throws InterruptedException {
	DeleteShopping del=new DeleteShopping(webtest);
	del.delete();
	}
}
