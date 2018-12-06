package com.decameron.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	private static String PAGE_URL = "https://www.decameron.com/";
	protected WebDriver driver;
	
	/**
	 * Constructor
	 */
	public HomePage() {
		System.setProperty("webdriver.chrome.marionette", "/bin/chromedriver");
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
