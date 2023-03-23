package com.AutomationTalks.demoProject_1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestClass1 {

	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ali.mcheik\\Desktop\\SpringBoot\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("https://www.AutomationTalks.com");
		System.out.println("Test 2 title is " + driver.getTitle());
	}
	@Test
	public void Test2() {
		driver.navigate().to("https://www.AutomationTalks.com");
		System.out.println("Test 2 title is " + driver.getTitle());
	}
	@Test
	public void Test3() {
		driver.navigate().to("https://www.AutomationTalks.com");
		System.out.println("Test 2 title is " + driver.getTitle());
	}
		
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
}
