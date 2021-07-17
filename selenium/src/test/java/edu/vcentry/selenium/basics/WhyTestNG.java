package edu.vcentry.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhyTestNG {
	
	WebDriver driver;
	
	public void setUp() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadAddressBook() {
		try {
			driver.get("http://a.testaddressbook.com");
			driver.findElement(By.id("QQQQQ")).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
			driver = null;
		}

	}
	
	public void loadGoogle() {
		try {
			driver.get("http://www.google.com");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void tearDown() {
		try {
			if(driver != null) {
				driver.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		WhyTestNG myTest = new WhyTestNG();
		myTest.setUp();
		myTest.loadAddressBook();
		myTest.tearDown();
		myTest.setUp();
		myTest.loadGoogle();
		myTest.tearDown();	
	}
}
