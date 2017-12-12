package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import manage.AddShopping;
import manage.DeleteShopping;
import manage.LoginClass;

public class testAddShopping extends BaseTest{
	@Test
    public void testLogin() throws InterruptedException {
    	LoginClass add=new LoginClass(webtest);
    	add.inputValuesSeccess("majiashuo", "123456");
    }
	
	@Test(dependsOnMethods="testLogin")
	 public void testAddShoppings() throws InterruptedException {
			AddShopping add2=new AddShopping(webtest);
			add2.addgoods();
		}
	
}
