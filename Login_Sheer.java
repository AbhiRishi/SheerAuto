package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Sheer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	       
		// Instantiate a ChromeDriver class
	        WebDriver driver = new ChromeDriver();
	  
	        // Maximize the browser
	        driver.manage().window().maximize();
	  
	        // Launch Website
	        driver.get("https://sheerexchangeadmin.5dtesting.com/login");
	        
	        String url = driver.getCurrentUrl();
	        System.out.println(url);
	        
	        String title= driver.getTitle();
	        System.out.println(title);
	       
	        //Enter Email
	        WebElement email = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("login-email")));
	        email.sendKeys("pritesh@gmail.com");
	        
	        //Enter Password
	        WebElement pass = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("login-password")));
	        pass.sendKeys("Password@123");
	        
	        //Submit
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        //Open side menu
//	        driver.findElement(By.cssSelector(".nav-menu-main > .ficon")).click();
	  	          
	        //Click on User module
	        WebElement user1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[3]/a/span")));
	        user1.click();
//	        driver.findElement(By.xpath("//li[3]/a/span"));
	        
	        
	        //Search_by_Name
	        WebElement user_search = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id("search-bar-input")));

	        user_search.click();

	        user_search.sendKeys("Abhishek");
	        
	        
	        //Export to CSV with search name
//	        driver.findElement(By.linkText("Export to csv')]")).click();
	        WebElement user2 = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Export to csv')]")));
	        user2.click();       
	        
	        //Clear filter
	        
	        driver.findElement(By.xpath("//div[4]/button/span")).click();
	        
	        //Download csv after_clear filter
	        WebElement user3 = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Export to csv')]")));
	        user3.click();       
	        
	        //Country filter
	        driver.findElement(By.xpath("//div[@id='countryfilter']/div/div")).click();
	        WebElement country_india = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='react-select-4-option-103']/div")));
	        country_india.click();  
	        
	        
	        //Download csv with country filter
	        WebElement user_country_fil = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Export to csv')]")));
	        user_country_fil.click();       
	        
	        //Clear filter
	        driver.findElement(By.xpath("//div[4]/button/span")).click();
	        
	      //Country filter Jordan
	        driver.findElement(By.xpath("//div[@id='countryfilter']/div/div")).click();
	        driver.findElement(By.xpath("//div[@id='react-select-4-option-113']/div")).click();
	        
	        
	        //Download csv with country filter jordan
	        WebElement user_country_filter_JOD = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Export to csv')]")));
	        user_country_filter_JOD.click();  
	        
	        //Clear filter
	        driver.findElement(By.xpath("//div[4]/button/span")).click();
	        
	      //Deactivate user
	     //   WebElement deactivate_user = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("xpath=//div[@id='cell-pnFVZid_W3g-undefined']/div/div/div/label")));
	       // deactivate_user.click(); 
	        
	}

}
