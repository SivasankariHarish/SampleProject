package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoProject {
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivasankari harish\\eclipse-workspace\\SeleniumConcept\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys("welcome");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPass.sendKeys("123456");
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		btnLogin.click();
	}
}
