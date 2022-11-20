package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.projectspecific;

public class LoginPage extends projectspecific {
	
	public LoginPage(RemoteWebDriver receiveddriver) {
		this.driver=receiveddriver;
	}

	public LoginPage Enterusername(String username) {	
		System.out.println("driver at @login: "+ driver);
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	public LoginPage Enterpassword(String password) {		
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public WelcomePage ClickLogin_Positive() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
	public LoginPage ClickLogin_Negative() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
	


}
