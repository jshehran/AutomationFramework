package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClarityTestPage {
	private WebDriver driver;
	private By inputFieldOne = By.id("input_text1");
	
	public ClarityTestPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void openBrowserUrl(String url){
		driver.get(url);
	}
	
	public void doClickButton(String buttonName){
		driver.findElement(By.xpath("//button[text()='" + buttonName + "']")).click();
	}
	
	
	public void doDoubleClickButton(String buttonName){
		WebElement buttonElement = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
		Actions act = new Actions(driver);
		act.doubleClick(buttonElement).perform();
		
	}
	
	public void doMouseOver(String buttonName){
		WebElement buttonElement = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
		Actions act = new Actions(driver);
		act.moveToElement(buttonElement).perform();
		
	}
	
	public void enterText(String inputText){
		WebElement buttonElement = driver.findElement(inputFieldOne);
		buttonElement.clear();
		buttonElement.sendKeys(inputText);
	}
	
	public String getDisplayMessage(By elementId){
		return driver.findElement(elementId).getText();
	}
}
