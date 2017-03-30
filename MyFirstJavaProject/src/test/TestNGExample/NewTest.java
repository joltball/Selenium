package test.TestNGExample;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;	

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	
	 	private WebDriver driver;	
		@Test			
		public void testEasy() throws Throwable {
			try{
				//System.setProperty("webdriver.gecko.driver","C:\\Users\\Bhanu\\Desktop\\Learn Selenium\\Browser Drivers\\geckodriver.exe");
				driver.get("http://www.guru99.com/selenium-tutorial.html");  
				String title = driver.getTitle();				 
				if (title.equalsIgnoreCase("Free Selenium Tutorials")){
					System.out.println("Yay!!!");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Bhanu\\Desktop\\Learn\\Learn Selenium\\Browser Drivers\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	