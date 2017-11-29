package manage;

import com.webtest.core.WebDriverEngine;

public class AddShopping {
	 public WebDriverEngine webtest;
	 public AddShopping(WebDriverEngine webtest) {
			this.webtest = webtest;
			
	    }
	 public void addgoods() throws InterruptedException {
		 webtest.click("link=majiashuo");
		 webtest.click("link=返回京东首页");
		 webtest.click("link=女士");
		 Thread.sleep(3000);
		 webtest.click("xpath=.//*[@id='hotsales']/div[2]/div[1]/div[2]/div[3]/a");
		 webtest.click("id=color35");
		 webtest.click("id=color30");
		 webtest.click("link=加入购物车");
	 }
}
