package manage;

import com.webtest.core.WebDriverEngine;

public class AddShopping {
	 public WebDriverEngine webtest;
	 public AddShopping(WebDriverEngine webtest) {
			this.webtest = webtest;
			
	    }
	 public void addgoods() throws InterruptedException {
		 webtest.getWindow(0);
		 webtest.click("link=majiashuo");
		 webtest.click("link=返回京东首页");
		 webtest.click("link=女士");
		 Thread.sleep(3000);
		 webtest.getWindow(1);
		 webtest.click("xpath=.//*[@id='hotsales']/div[2]/div[1]/div[2]/div[3]/a");
		 webtest.getWindow(2);
		 Thread.sleep(3000);
		 webtest.click("xpath=.//*[@id='choose']/div[1]/div[1]/div[2]/label[1]");
		 webtest.click("xpath=.//*[@id='choose']/div[1]/div[2]/div[2]/label[1]");
		 Thread.sleep(3000);
		 webtest.runJs("window.scrollBy(0,2000)");
		 webtest.click("xpath=.//*[@id='choose']/div[2]/div/a/b");
		 webtest.alertAccept();
		 webtest.closeWindow();
		 webtest.getWindow(1);
		 webtest.closeWindow();
	 }
}
