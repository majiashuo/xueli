package manage;

import com.webtest.core.WebDriverEngine;

public class AddMassage {
public String nickname;
public String email;
public String realName;
public String password;
public String repassword;
public WebDriverEngine webtest;

public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRealName() {
	return realName;
}
public void setRealName(String realName) {
	this.realName = realName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRepassword() {
	return repassword;
}
public void setRepassword(String repassword) {
	this.repassword = repassword;
}
public AddMassage(WebDriverEngine webtest) {
	this.webtest = webtest;
	
}
public void input(String nickname,String email,String realName,String password,String repassword) throws InterruptedException {
	Thread.sleep(3000);
	webtest.click("xpath=.//*[@id='shortcut']/div/ul[2]/li[1]/a[1]");
	webtest.type("name=nickname", nickname);
	webtest.click("xpath=//input[@value='男']");
	webtest.type("name=email", email);
	webtest.type("name=username", realName);
	webtest.type("name=password", password);
	webtest.type("name=repassword", repassword);
	webtest.click("xpath=//input[@type='submit']");
	
}
}
