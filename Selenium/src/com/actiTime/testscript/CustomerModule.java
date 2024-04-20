package com.actiTime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class CustomerModule {
		@Test(priority=1,invocationCount=1)
		public void createCustomer()
		{
			Reporter.log("Create Customer",true);
			//Assert.fail();
		}
		@Test(priority=1,invocationCount=1,dependsOnMethods = "createCustomer")
		public void modfyCustomer()
		{
			Reporter.log("modify Customer",true);
		}
}
