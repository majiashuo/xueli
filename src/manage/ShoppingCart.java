package manage;

import com.webtest.core.WebDriverEngine;

public class ShoppingCart {
	public WebDriverEngine webtest;
	public ShoppingCart(WebDriverEngine webtest) {
		this.webtest = webtest;
		
	}
	public void buyGoods() {
		webtest.click("linkText=我的购物车");
		webtest.click("linkText=去购物车");
		
	}
}
