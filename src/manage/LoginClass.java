package manage;

import com.webtest.core.WebDriverEngine;

public class LoginClass {
	
    public WebDriverEngine webtest;
    public LoginClass(WebDriverEngine webtest) {
		this.webtest = webtest;
		
    }
	public void inputValuesSeccess(String name,String password) throws InterruptedException {
		webtest.open("http://localhost:8032/zl_shop/index.php/login/login.html");
        Thread.sleep(3000);
		webtest.type("name=username", name);
		webtest.type("name=password", password);
		webtest.click("xpath=//input[@type='submit']");
		}
	
	
}