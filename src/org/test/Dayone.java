package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayone {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\dri\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com/");
	dr.manage().window().maximize();
	String title = dr.getTitle();
	System.out.println(title);
	String currentUrl = dr.getCurrentUrl();
	System.out.println(currentUrl);
	System.out.println("Kumar");
	System.out.println("name is Raj");	
    System.out.println("Kumar");
	dr.close();
	
	}
}
