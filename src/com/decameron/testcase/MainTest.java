package com.decameron.testcase;

import com.decameron.logic.HomePage;

public class MainTest {
	
	public static void main(String args[]) {
		
		try {
			HomePage home = new HomePage();
			home.openPage();
			home.executeScenario();
			Thread.sleep(2000);
			home.closePage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
