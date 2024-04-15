 package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


public class DashboardPage {
	
	
	WebDriver driver;
	

	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	@FindBy(how = How.XPATH, using="/html/body/div[1]/section/div/div[2]/div/div/header/div/strong") WebElement DashboardHeaderElement;
	@FindBy(how = How.XPATH, using="/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span") WebElement CustomerButtonElement;
	@FindBy(how = How.XPATH, using="//*[@id=\"customers\"]/li[2]/a/span") WebElement AddCustomerButtonElement;
	
	
	public void validateDashboardPage(String dashboardHeaderText) {
		
		Assert.assertEquals(DashboardHeaderElement.getText(), dashboardHeaderText, "Dashboard page did not found");

	
	}
	
	
	public void clickOnCustomerButton() {
		CustomerButtonElement.click();
	}
	
	public void clickOnAddCustomerButton() {
		AddCustomerButtonElement.click();
	}
	


}
