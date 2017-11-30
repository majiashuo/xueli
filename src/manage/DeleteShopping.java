package manage;

import com.webtest.core.WebDriverEngine;

public class DeleteShopping {
	 public WebDriverEngine webtest;
	 public DeleteShopping(WebDriverEngine webtest) {
			this.webtest = webtest;
			
	    }
	 public void delete() throws InterruptedException {
		 webtest.click("link=majiashuo");
		 webtest.click("link=返回京东首页");
		 webtest.mouseoverElement("link=我的购物车");
		 boolean flag = webtest.getHtmlSource().contains("删除");
		 if(flag) {
		 webtest.click("link=删除");
		 }
	 }
}
