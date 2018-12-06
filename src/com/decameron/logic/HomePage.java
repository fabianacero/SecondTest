package com.decameron.logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private static String PAGE_URL = "https://www.decameron.com/es/co-inicio";
	protected WebDriver driver;
	protected int timeOutInSeconds = 10;
	
	/**
	 * Constructor
	 */
	public HomePage() {
		System.setProperty("webdriver.chrome.marionette", "/tmp/chromedriver");
	}

	public void validateLigthBox() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("eighty_close_welcome_widget_iframe")));
		//driver.switchTo().frame(driver.findElement(By.id("eighty_close_welcome_widget_iframe")));
		
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".new_widget_popup_welcome a.close_position")));
		driver.findElement(By.cssSelector(".new_widget_popup_welcome>a.close_position")).click();*/
		
		System.out.println("Es Visible");
	}
	
	/**
	 * Abre la pagina de inicio
	 */
	public void openPage(){
		driver = new ChromeDriver();
		driver.get(PAGE_URL);
	}
	
	/**
	 * Cierra la pagina de inicio
	 */
	public void closePage(){
		driver.quit();
	}

}
