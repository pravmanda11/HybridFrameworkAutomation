package com.RanfordBank.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.RanfordBank.utilities.ReadDataProvider;

public class TC_03_VerifyCreateAccount extends BaseClass {

	@DataProvider
	public Object[][] getLoginData() {
		Object data[][] = ReadDataProvider.getDataFromExcel("Register");
		return data;
	}

	@Test
	public void createnewAcciunt(String Fname) {

	}

}
