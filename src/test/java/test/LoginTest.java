package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	

	
	String userName="demo@codefios.com";
	String password="abc123";
	String dashboardHeaderText="Dashboard";
	String userNameAlertMsg="Please enter your user name";
	String passwordAlertMsg="Please enter your password";
	
	@Test
	public void validUserShouldBeAbleToLogin()  {
		
		driver=BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clicSigninButton();
		
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(dashboardHeaderText);
		
		BrowserFactory.tearDown();
	
	}
	
	@Test
	public void validateAlertMsg() {
		
		driver=BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.clicSigninButton();
		loginPage.validateUserErrorMsg(userNameAlertMsg);
		
		loginPage.insertUserName(userName);
		loginPage.clicSigninButton();
		loginPage.validatePasswordErrorMsg(passwordAlertMsg);
		
		BrowserFactory.tearDown();
	}

}
