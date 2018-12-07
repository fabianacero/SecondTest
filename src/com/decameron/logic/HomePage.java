package com.decameron.logic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	private static String PAGE_URL = "https://www.decameron.com/es/co-inicio";
	protected WebDriver driver;
	protected int timeOutInSeconds = 10;
	
	/**
	 * Constructor
	 */
	public HomePage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fabiab\\workspace\\SecondTest\\bin\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void executeScenario() throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", driver.findElement(By.id("tiquetesAereos")));
		Thread.sleep(500);
		((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", driver.findElement(By.id("tiquetesTerrestres")));
		Thread.sleep(500);
		((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", driver.findElement(By.id("sinTransporte")));
	}
	
	/**
	 * Abre la pagina de inicio
	 */
	public void openPage(){

		driver.get(PAGE_URL);
	}
	
	/**
	 * Cierra la pagina de inicio
	 */
	public void closePage(){
		driver.quit();
	}

}
