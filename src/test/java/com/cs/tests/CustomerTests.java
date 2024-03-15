package com.cs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.AddCustomerDetailsPage;
import com.cs.pages.OrangeHRMHomepage;
import com.cs.pages.OrangeHRMLoginPage;

public class CustomerTests extends BaseTest 
{

	@Test
	public void addCustomerTest()
	{
		// a test script should have assertion (at least 1)
		// test script should not low level method calls ex: driver.findElement, selenium API
		
		// Login 
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		OrangeHRMHomepage ohhp =  ohlp.enterUsername("Admin")
										.enterPassword("admin123")
										.clickLoginBtn();
		
		ohhp.clickOnPIMOption()
			.ClickOnAddBtn();
		
		AddCustomerDetailsPage acd = new AddCustomerDetailsPage();
		acd.enterFName("Vedant")
			.enterMName("Vishwas")
			.enterLName("Kulkarni")
			.clickOnSaveBtn();

		String expMsg = "Successfully Saved";
		String actMsg = acd.getConfMsg();
		System.out.println("actMsg : " + actMsg);
		Assert.assertEquals(actMsg, expMsg, "Customer did not save !");
	}
}
