package com.ferno.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class facebook {
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement login;
	
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement pass;
	
	public void login() {
		login.sendKeys("jbnzz");
		pass.sendKeys("jibinjose@1");
	}
	
	

}
