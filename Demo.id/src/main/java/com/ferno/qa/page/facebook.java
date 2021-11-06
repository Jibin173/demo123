package com.ferno.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ferno.qa.base.TestBase;

public class facebook extends TestBase{
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement login;
	
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement pass;
	public facebook(){
		PageFactory.initElements(driver, this);
	}
	public void login() {
		login.sendKeys("jbnzz");
		pass.sendKeys("jibinjose@1");
	}
	
	

}
