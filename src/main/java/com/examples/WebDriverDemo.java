package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.pluralsight.com");
		driver.get("http://www.google.com");
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.click();
		searchField.sendKeys("pluralsight");
		searchField.sendKeys(Keys.ENTER);
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
		WebElement imagesElement = driver.findElements(By.cssSelector("img[class='rg_i Q4LuWd']")).get(0);
		imagesElement.click();
		
		driver.getPageSource().contains("");
	}
}
