package manage;

import com.webtest.core.WebDriverEngine;

public class AddAddress {
    public WebDriverEngine webtest;
    public AddAddress(WebDriverEngine webtest) {
	this.webtest = webtest;
	

	
  }
    public void input(String person,String province,String city,String county,String address2,String phone,String code) throws InterruptedException {
	Thread.sleep(3000);
	webtest.click("link=majiashuo");
	Thread.sleep(3000);
	webtest.click("link=收货地址");
	webtest.click("link=添加收货地址");
	webtest.type("name=linkman", person);
	webtest.selectByValue("name=province", province);
	webtest.selectByValue("name=city", city);
	webtest.selectByValue("name=county", county);
	webtest.type("name=address2", address2);
	webtest.type("name=phone", phone);
	webtest.type("name=code", code);
	Thread.sleep(3000);
	webtest.click("xpath=//*[@id='add_address']/div[2]/div");
	Thread.sleep(5000);                         
	webtest.getAlert().accept();
	
}
}
