package manage;

import com.webtest.core.WebDriverEngine;

public class AddMassage {

public WebDriverEngine webtest;
public AddMassage(WebDriverEngine webtest) {
	this.webtest = webtest;
	}
public void input(String nickname,String email,String realName,String password,String repassword) throws InterruptedException {
	Thread.sleep(3000);
	webtest.click("link=majiashuo");
	webtest.typeAndClear("name=nickname",nickname);
	webtest.click("xpath=//input[@value='男']");
	webtest.typeAndClear("name=email",email);
	webtest.typeAndClear("name=username",realName);
	webtest.typeAndClear("name=password",password);
	webtest.typeAndClear("name=repassword",repassword);
	webtest.click("xpath=//input[@type='submit']");
	
}
}
