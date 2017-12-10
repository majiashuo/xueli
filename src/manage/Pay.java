package manage;

import com.webtest.core.WebDriverEngine;

public class Pay {
	public WebDriverEngine webtest;
    public Pay(WebDriverEngine webtest) {
	this.webtest = webtest;
    }
    public void payAll() throws InterruptedException {
    	 webtest.getWindow(0);
    	 webtest.click("link=majiashuo");
		 webtest.click("link=返回京东首页");
		 webtest.click("link=我的购物车");
		 webtest.getWindow(1);
		 webtest.click("xpath=.//*[@id='option_box']/div[1]/span[1]/input");
		 webtest.click("link=去 结 算");
		 Thread.sleep(3000);
		 webtest.click("link=提 交 订 单");
		 webtest.closeWindow();
    }
    public void pay(int i) throws InterruptedException {
    	 webtest.getWindow(0);
    	 webtest.click("link=majiashuo");
		 webtest.click("link=返回京东首页");
		 webtest.click("link=我的购物车");
		 webtest.getWindow(1);
		 webtest.click("xpath=.//*[@id='car_goods']/div["+i+"]/div[1]/input[1]");
		 webtest.click("link=去 结 算");
		 Thread.sleep(3000);
		 webtest.click("link=提 交 订 单");
		 webtest.closeWindow();
    }
    public void payNone() {
    	 webtest.getWindow(0);
    	 webtest.click("link=majiashuo");
		 webtest.click("link=返回京东首页");
		 webtest.click("link=我的购物车");
		 webtest.getWindow(1);
		 webtest.click("link=去 结 算");
		 webtest.getAlert().accept();
		 webtest.closeWindow();
    }
}
