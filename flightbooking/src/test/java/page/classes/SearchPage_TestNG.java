package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage_TestNG {
	
	public static WebElement element = null;
 //   static Logger log = Logger.getLogger(SearchPage.class);
	
	/**
	 * Returns the flight origin text box
	 * @param driver
	 * @return WebElement
	 */
	public static WebElement originTextBox(WebDriver driver)
	{
		element = driver.findElement(By.id("flight-origin"));
		return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin)
	{
		element = originTextBox(driver);
		element.clear();
		element.sendKeys(origin);
//		log.info("Entered origin city as " + origin);
	} 
	
	
	/**
	 * Returns the flight destination text box
	 * @param driver
	 * @return WebElement
	 */
	public static WebElement destinationTextBox(WebDriver driver)
	{
		element = driver.findElement(By.id("flight-destination"));
		return element;
	}
	
	public static void fillDestinationTextBox(WebDriver driver, String destination)
	{
		element = destinationTextBox(driver);
		element.clear();
		element.sendKeys(destination);
//		log.info("Entered destination city as " + destination);
	}
	/**
	 * Returns the departure date text box
	 * @param driver
	 * @return WebElement
	 */
	public static WebElement departureDateTextBox(WebDriver driver)
	{
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}

	public static void fillDepartureDate(WebDriver driver, String date)
	{
		element = departureDateTextBox(driver);
		element.clear();
		element.sendKeys(date);
	}
	
	/**
	 * Returns the return date text box
	 * @param driver
	 * @return WebElement
	 */
	public static WebElement returnDateTextBox(WebDriver driver)
	{
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}
	
	public static void fillReturnDate(WebDriver driver, String date)
	{
		element = returnDateTextBox(driver);
		element.clear();
		element.sendKeys(date);
	}
	
	/**
	 * Returns the Search Button Element
	 * @param driver
	 * @return WebElement
	 */
	public static WebElement returnSearchButton(WebDriver driver)
	{
		element = driver.findElement(By.id("search-button"));
		return element;
	}
	
	/**
	 * Click on the Search Button Element
	 * @param driver
	 * @return None
	 */
	public static void clickSearchButton(WebDriver driver)
	{
		returnSearchButton(driver).click();
	}
	
	/**
	 * Navigate to Flights Tab
	 * @param driver
	 * @return WebElement
	 */
	public static void navigateToFlightsTab(WebDriver driver)
	{
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
	}
	
	/**
	 * Returns the Advanced Options Element
	 * @param driver
	 * @return WebElement
	 */
	public static WebElement returnAdvancedOptions(WebDriver driver)
	{
		element = driver.findElement(By.id("advanced-options"));
		return element;
	}
	
	/**
	 * Click on the Advanced Options Element
	 * @param driver
	 * @return None
	 */
	public static void clickAdvancedOptions(WebDriver driver)
	{
		returnAdvancedOptions(driver).click();
	}
	
	
	/**
	 * Returns the Non Stop Element
	 * @param driver
	 * @return WebElement
	 */
	public static WebElement returnNonStop(WebDriver driver)
	{
		element = driver.findElement(By.id("advanced-flight-nonstop-label"));
		return element;
	}
	
	/**
	 * Click on the Non Stop Element
	 * @param driver
	 * @return None
	 */
	public static void clickNonStop(WebDriver driver)
	{
		returnNonStop(driver).click();
	}
	
	/**
	 * Returns the PreferredClass
	 * @param driver
	 * @return WebElement
	 */
	public static WebElement returnPreferredClass(WebDriver driver)
	{
		element = driver.findElement(By.id("flight-advanced-preferred-class"));
		return element;
	}
	
	public static void fillPreferredClass(WebDriver driver, String travelClass)
	{
		element = returnPreferredClass(driver);
		element.sendKeys(travelClass);
	}
	
	/**
	 * Selects the morning flights only
	 * @param driver
	 * @return None
	 */
	public static void clickMorningFlights(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("a11y-departure-MORNING")));
		element.click();
	}
}

