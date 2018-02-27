package runnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

//glue={"stepDefinitionPackage"}
@CucumberOptions(features={"features"},glue={"stepDefinitionPackage"})
public class testRunner extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
	 //use webdriver manager to specify which drive to use 
	    WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();		
	}
	
	@AfterMethod
	
	public void stop() {
		System.out.println("Close the applicaiton");
		driver.close();
	}

}
