package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass {

	@Test
	public void loginApp() throws InterruptedException {

		logger = report.createTest("Login to CRM");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.LoginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		Helper.captureScreenshot(driver);
		
		logger.pass("Logging Success");

	}

}
