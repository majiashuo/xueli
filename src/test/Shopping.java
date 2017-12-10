package test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import manage.AddShopping;
import manage.DeleteShopping;

public class Shopping extends BaseTest{
	
	
	@Test
	 public void testAddShopping() throws InterruptedException {
			AddShopping add2=new AddShopping(webtest);
			add2.addgoods();
		}
	 @Test
	 public void testDeleteShopping() throws InterruptedException {
		 DeleteShopping del=new DeleteShopping(webtest);
		 del.delete();
	 }
}
