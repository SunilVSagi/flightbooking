package com.expedia.flightbooking;

import org.testng.annotations.Test;

import page.classes.SearchPage_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class TestNG_Parametrizing_XML {
	
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

	
  @Parameters({"origin", "dest", "deptDate", "retDate"})	
  @Test
  public void BasicSearch(String origin, String dest, String deptDate, String retDate) {
	  	SearchPage_TestNG.navigateToFlightsTab(driver);
	  	Reporter.log("Origin city is " + origin, true);
	  	SearchPage_TestNG.fillOriginTextBox(driver, origin);
		SearchPage_TestNG.fillDestinationTextBox(driver, dest);
		SearchPage_TestNG.fillDepartureDate(driver, deptDate);
		SearchPage_TestNG.fillReturnDate(driver, retDate);
			
	//	SearchPage.clickSearchButton(driver);
	  
  }

  
  
  @Test (dataProvider = "fieldInput")
  public void multiSearch(String originCity, String destCity, String deptDate, String retDate) throws InterruptedException {
	  	SearchPage_TestNG.navigateToFlightsTab(driver);
	  	SearchPage_TestNG.fillOriginTextBox(driver, originCity);
		SearchPage_TestNG.fillDestinationTextBox(driver, destCity);
		SearchPage_TestNG.fillDepartureDate(driver, deptDate);
		SearchPage_TestNG.fillReturnDate(driver, retDate);
		Thread.sleep(3000);	
	//	SearchPage.clickSearchButton(driver);
	  
  }
  
  
  @Test (dependsOnMethods = {"BasicSearch"})
  public void AdvancedSearch() {
		
		SearchPage_TestNG.clickAdvancedOptions(driver);
		SearchPage_TestNG.clickNonStop(driver);
		SearchPage_TestNG.fillPreferredClass(driver, "Economy/Coach");
		
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
