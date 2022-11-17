package com.verify;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileSearch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\D E L L\\eclipse-workspace\\DeepanChakkaravarthy\\Library\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// launch Browser
		driver.get("https://www.amazon.in/");

		// Searching for Iphone in searchbox
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("google pixel");

		// Selecting one mobile from all
		driver.findElement(By.id("nav-search-submit-button")).click();

		// Launch the Mobile present Webpage
		driver.get("https://www.amazon.in/Google-Pixel-Sage-128GB-Storage/dp/B0B3Q23BT4/ref=sr_1_1?keywords=google+pixel&qid=1668597947&qu=eyJxc2MiOiI1LjUxIiwicXNhIjoiNS40OCIsInFzcCI6IjQuMzUifQ%3D%3D&sr=8-1");

		// Adding the mobile to the Cart
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(10000);

		// close the website
		driver.quit();
	}
}
