package com.expedia.flightbooking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.SearchPageFactory;

public class PageFactoryDemo {
	
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		baseURL = "https://www.expedia.com";
		driver = new FirefoxDriver();
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		SearchPageFactory TestCase = new SearchPageFactory(driver);
		
		TestCase.clickFlightTab();
		TestCase.clickRoundTrip();
		TestCase.fillOriginCity("NewYork");
		TestCase.fillDestinationCity("Orlando");
		TestCase.fillDepartDate("08/01/2016");
		TestCase.fillReturnDate("08/05/2016");
		TestCase.clickSearch();
	}

}
