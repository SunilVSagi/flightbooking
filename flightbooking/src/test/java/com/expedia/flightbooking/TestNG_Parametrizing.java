package com.expedia.flightbooking;

import org.testng.annotations.Test;

import page.classes.SearchPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class TestNG_Parametrizing {
	
	WebDriver driver;
	String baseURL;
	
	@BeforeClass
	  public void beforeMethod() {
		baseURL= "https://www.expedia.com";
		driver = new FirefoxDriver();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  }


	
 @DataProvider (name = "fieldInput")
 public static Object[][] searchData()
 {
	 return new Object [][] { { "New York", "Orlando", "08/01/2016", "08/10/2016"},
		 			 { "New York", "Boston", "08/11/2016", "08/12/2016"}};
 }
	
	
//  @Parameters({"origin", "dest", "deptDate", "retDate"})	
//  @Test
//  public void BasicSearch(String origin, String dest, String deptDate, String retDate) {
//	  	SearchPage.navigateToFlightsTab(driver);
//	  	Reporter.log("Origin city is " + origin, true);
//	  	SearchPage.fillOriginTextBox(driver, origin);
//		SearchPage.fillDestinationTextBox(driver, dest);
//		SearchPage.fillDepartureDate(driver, deptDate);
//		SearchPage.fillReturnDate(driver, retDate);
			
	//	SearchPage.clickSearchButton(driver);
	  
//  }
  
  @Test (dataProvider = "fieldInput")
  public void multiSearch(String originCity, String destCity, String deptDate, String retDate) throws InterruptedException {
	  	SearchPage.navigateToFlightsTab(driver);
	  	SearchPage.fillOriginTextBox(driver, originCity);
		SearchPage.fillDestinationTextBox(driver, destCity);
		SearchPage.fillDepartureDate(driver, deptDate);
		SearchPage.fillReturnDate(driver, retDate);
		Thread.sleep(3000);	
	//	SearchPage.clickSearchButton(driver);
	  
  }
  
  
  @Test (dependsOnMethods = {"BasicSearch"})
  public void AdvancedSearch() {
		
		SearchPage.clickAdvancedOptions(driver);
		SearchPage.clickNonStop(driver);
		SearchPage.fillPreferredClass(driver, "Economy/Coach");
		
//		SearchPage.clickSearchButton(driver);
	  
  }
  
  @Test (dependsOnMethods = {"AdvancedSearch"})
  public void selectMorningFlights() {
		
	//	SearchPage.clickMorningFlights(driver);
	
	//	SearchPage.clickSearchButton(driver);
	  
  }
  
  @AfterClass
  public void afterMethod() {
  }

}
