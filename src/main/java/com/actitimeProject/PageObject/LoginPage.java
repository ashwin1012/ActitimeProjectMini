package com.actitimeProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	 WebElement unTbx;

	@FindBy(name="pwd")
	 WebElement pwTbx;

	@FindBy(xpath="//div[text()='Login ']")
	 WebElement lgBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) {
		 unTbx.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		pwTbx.sendKeys(pw);
	}
	
	public void LoginBtn() {
		lgBtn.click();
	}
}

