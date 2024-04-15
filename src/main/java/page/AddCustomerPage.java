 package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


public class AddCustomerPage {
	
	
	WebDriver driver;
	

	
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	@FindBy(how = How.XPATH, using="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div/strong") WebElement addCustomerHeaderElement;
	@FindBy(how = How.XPATH, using="//*[@id=\"general_compnay\"]/div[1]/div/input") WebElement FullNameElement;
	
	
	public void validateAddCustomerPage(String addCustomerHeaderText) {
		
		Assert.assertEquals(addCustomerHeaderElement.getText(), addCustomerHeaderText, "addCustomer page did not found");
	}
	
	public void insertFullNAme(String fullName) {
		FullNameElement.sendKeys(fullName);
	}
	


}
