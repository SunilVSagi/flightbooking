package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	
	WebDriver driver;
	
	@FindBy(id="tab-flight-tab")
	WebElement flights;

	@FindBy(id="flight-type-roundtrip-label")
	WebElement roundTrip;
	
	@FindBy(id="flight-type-one-way-label")
	WebElement oneWay;
	
	@FindBy(id="flight-type-multi-dest-label")
	WebElement multipleDestination;
	
	@FindBy(id="flight-origin")
	WebElement originCity;
	
	@FindBy(id="flight-destination")
	WebElement destinationCity;
	
	
	@FindBy(id="flight-departing")
	WebElement departingDate;
	
	@FindBy(id ="flight-returning")
	WebElement returnDate;
	
	@FindBy(id="search-button")
	WebElement searchButton;
	
	/***
	 * Initiating the web Elements
	 * @param driver
	 */
	
	public SearchPageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	public void clickFlightTab()
	{
		flights.click();
	}
	
	public void clickRoundTrip()
	{
		roundTrip.click();
	}
	
	public void fillOriginCity(String originPlace)
	{
		originCity.clear();
		originCity.sendKeys(originPlace);
	}
	
	public void fillDestinationCity(String destination)
	{
		destinationCity.sendKeys(destination);
	}
	
	public void fillDepartDate(String departDate)
	{
		departingDate.clear();
		departingDate.sendKeys(departDate);
	}
	
	public void fillReturnDate(String returnDT)
	{
		returnDate.clear();
		returnDate.sendKeys(returnDT);
	}
	
	public void clickSearch()
	{
		searchButton.click();
	}
}
