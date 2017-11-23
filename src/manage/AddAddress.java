package manage;

import com.webtest.core.WebDriverEngine;

public class AddAddress {
   public String person;
   public String province;
   public String city;
   public String county;
   public String address;
   public String phone;
   public String code;
   public WebDriverEngine webtest;

public String getPerson() {
	return person;
}
public void setPerson(String person) {
	this.person = person;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCounty() {
	return county;
}
public void setCounty(String county) {
	this.county = county;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public AddAddress(WebDriverEngine webtest) {
	this.webtest = webtest;
	
}
public void input(String person,String province,String city,String county,String address2,String phone,String code) throws InterruptedException {
	Thread.sleep(3000);
	webtest.click("xpath=.//*[@id='shortcut']/div/ul[2]/li[1]/a[1]");
	Thread.sleep(3000);
	webtest.click("linkText=收货地址");
	webtest.click("linkText=添加收货地址");
	webtest.type("name=person", person);
	webtest.selectByValue("name=province", province);
	webtest.selectByValue("name=city", city);
	webtest.selectByValue("name=county", county);
	webtest.type("name=email", address2);
	webtest.type("name=username", phone);
	webtest.type("name=password", code);
	webtest.click("xpath=.//*[@id='add_address']/div[2]/div");
	
}
}
