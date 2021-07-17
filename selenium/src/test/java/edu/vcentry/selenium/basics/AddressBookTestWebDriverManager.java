package edu.vcentry.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddressBookTestWebDriverManager {

	public static void main(String[] args) {
		
//		String projectRoot = System.getProperty("user.dir");
//		String driverPath = "\\src\\drivers\\geckodriver.exe";
//		System.out.printf("Project root - %s\n", projectRoot);
//		String finalPath = String.format("%s%s", projectRoot, driverPath);
//		System.out.printf("final path - %s\n", finalPath);
//		//ChromeDriver path => E:\\coderepo\\b173java\\javapractice\\src\\drivers\\chromedriver.exe
//		System.setProperty("webdriver.gecko.driver", finalPath);
//		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		//Initializing the driver
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("http://a.testaddressbook.com");
		
		WebElement signIn = driver.findElement(By.id("sign-in"));
		signIn.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
		//driver.quit();

	}
}


//WebDriver - interface
//ChromeDriver implements WebDriver (ChromeDriver extends RemoteWebDriver implements WebDriver)

//Sports - interface
//Cricket implements Sports
//Sports cricket = new Cricket();