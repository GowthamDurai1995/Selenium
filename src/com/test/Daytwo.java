package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Daytwo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Selenium\\\\dri\\\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://netbanking.hdfcbank.com/");
		dr.manage().window().maximize();
		WebElement txtCustomerID = dr.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtCustomerID.sendKeys("Gowtham");
	}

}
