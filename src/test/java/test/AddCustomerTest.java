package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	

	
	String userName="demo@codefios.com";
	String password="abc123";
	String dashboardHeaderText="Dashboard";
	String userNameAlertMsg="Please enter your user name";
	String passwordAlertMsg="Please enter your password";
	String addCustomerHeaderText = "New Customer";
	String fullName="Selenium";
	 
	
	@Test
	public void UserShouldBeAbleToAddCustomer()  {
		
		driver=BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.performLogin(userName, password);
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(dashboardHeaderText);
		dashboardPage.clickOnCustomerButton();
		dashboardPage.clickOnAddCustomerButton();
		
		
		AddCustomerPage addcustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomerPage.validateAddCustomerPage(addCustomerHeaderText);
		addcustomerPage.insertFullNAme(fullName);
		
		
	
	}
	


}
