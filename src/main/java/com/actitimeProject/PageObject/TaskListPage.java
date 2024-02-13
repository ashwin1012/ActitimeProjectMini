package com.actitimeProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	
   @FindBy(xpath="//div[@class='addNewButton']")
   WebElement addNewBtn;
  	
  @FindBy(xpath="//div[@class='item createNewCustomer']")
   WebElement newCustomer;
  	
  @FindBy(xpath="//div[@class='customerNameDiv']")
   WebElement enterCustomerNameTbx;

  @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
   WebElement enterCustomerDescription;

  @FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
   WebElement selectCustomerDD;

  @FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
   WebElement ourCompanyTx;

  @FindBy(xpath="//div[text()='Create Customer']")
   WebElement createCustomerBtn;

  @FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
   WebElement actualCustomerCreated;

  public TaskListPage(WebDriver driver) {
  	PageFactory.initElements(driver, this);
  }

  public WebElement getAddNewBtn() {
  	return addNewBtn;
  }

  public WebElement getNewCustomer() {
  	return newCustomer;
  }

  public WebElement getEnterCustomerNameTbx() {
  	return enterCustomerNameTbx;
  }

  public WebElement getEnterCustomerDescription() {
  	return enterCustomerDescription;
  }

  public WebElement getSelectCustomerDD() {
  	return selectCustomerDD;
  }

  public WebElement getOurCompanyTx() {
  	return ourCompanyTx;
  }

  public WebElement getCreateCustomerBtn() {
  	return createCustomerBtn;
  }

  public WebElement getActualCustomerCreated() {
  	return actualCustomerCreated;
  }
}
