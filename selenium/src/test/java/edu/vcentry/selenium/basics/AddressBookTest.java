package edu.vcentry.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddressBookTest {

	public static void main(String[] args) {
		
		//Setup of WebDriver
		WebDriverManager.chromedriver().setup();
		//Driver object initialized with ChromeDriver.  Its opens the Chrome Browser.
		WebDriver driver =  new ChromeDriver();
		//Load the required webApplication in the opened Chrome Browser
		driver.get("http://a.testaddressbook.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Closing the driver
		driver.close();

	}

}
