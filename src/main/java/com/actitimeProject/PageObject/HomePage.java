package com.actitimeProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="logoutLink")
	WebElement lgOut;

	@FindBy(id = "container_tasks")
	WebElement tasksTab;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getlogoutBtn() {
		 lgOut.click();
	}
	public void getTaskTab() {
		 tasksTab.click();
	}
}