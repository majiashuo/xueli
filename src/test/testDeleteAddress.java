package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import manage.DeleteAddress;
import manage.LoginClass;

public class testDeleteAddress extends BaseTest{
	@Test
    public void testLogin() throws InterruptedException {
    	LoginClass add=new LoginClass(webtest);
    	add.inputValuesSeccess("majiashuo", "123456");
    }
	
	 @Test(dependsOnMethods="testLogin")
	 public void testDeleteAddresses() throws Exception {
		 DeleteAddress del=new DeleteAddress(webtest);
		 del.delete();
	 }
}
