package manage;

import com.webtest.core.WebDriverEngine;

public class DeleteAddress {
	 public WebDriverEngine webtest;
	 public DeleteAddress(WebDriverEngine webtest) {
			this.webtest = webtest;
			
	    }
	 public void delete() {
		 for(int i=2;i<=6;i++) {
		 webtest.click("xpath=.//*[@id='add']/div[2]/div[2]/span/a");
		 }
	 }
}
