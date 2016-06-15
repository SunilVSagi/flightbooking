package com.expedia.flightbooking;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG_Group {
 
	@Test (groups = {"Honda", "Sedan"})
  public void hondaAccord() {
	  System.out.println("Honda Accord");
  }
  
	@Test (groups = {"Honda", "SUV"})
	  public void hondaCRV() {
		  System.out.println("Honda CRV");
	  }
	
	@Test(groups = {"Toyota", "Sedan"})
	  public void toyotaCamry() {
		  System.out.println("Toyota Camry");
	  }
	
	@Test(groups = {"Toyota", "SUV"})
	  public void toyota4Runner() {
		  System.out.println("Toyota 4 Runner");
	  }
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

}
