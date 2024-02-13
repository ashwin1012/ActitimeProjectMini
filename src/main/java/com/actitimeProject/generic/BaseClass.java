package com.actitimeProject.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
public WebDriver driver;
public WebDriverWait wait;
public FileLibrary f;	
	public WebDriver initializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		f=new FileLibrary();
		return driver;
		
	}
	
	public void waitForElementVisibility(WebElement element, Duration timeout) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToBeClickable(WebElement element, Duration timeout) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForTextToBePresentInElement(WebElement element, String text, Duration timeout) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	public void clickAndWaitForElementToBeClickable(WebElement element, Duration timeout) {
		waitForElementToBeClickable(element, timeout);
		element.click();
	}

}
