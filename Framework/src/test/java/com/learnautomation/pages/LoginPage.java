package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement uname;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement pname;

	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement bname;

	public void LoginToCRM(String username, String password) {

		uname.sendKeys(username);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}

		pname.sendKeys(password);

		bname.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}

	}

}
