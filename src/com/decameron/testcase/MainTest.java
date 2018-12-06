package com.decameron.testcase;

import com.decameron.logic.HomePage;

public class MainTest {
	
	public static void main(String args[]) {
		
		try {
			HomePage home = new HomePage();
			home.openPage();
			Thread.sleep(5);
			home.closePage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
