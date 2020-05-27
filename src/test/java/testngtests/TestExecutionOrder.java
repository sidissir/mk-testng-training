package testngtests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExecutionOrder {
	
	
	
	
	
	// @Test => Call all those methods with this annotation as test method
	@Test(priority = 0) 
	public void loginTest() {
		System.out.println("I am loginTest");

		// Open browser
		// Go to login page
		// Login with valid credentials
		// Verify that login is succesfull
		Assert.assertEquals("something", "something", "Login functionality is not working.");
	}

	@Test(priority = 1)
	public void logOutTest() {
		// Open browser
		// Go to login page
		// Login with valid credentials
		// click logout
		// Verify that logout is successfull
		System.out.println("I am logOutTest");

	}

	@Test(priority = 3)
	public void forgotPasswordTest() {
		System.out.println("I am forgotPasswordTest");

	}

	@Test(priority = 2)
	public void addToCartTest() {
		// Open browser
		// Go to login page
		// Login with valid credentials
		// search
		// Add to cart
		// Verify that item is added to the cart
		System.out.println("I am addToCartTest");

	}
}
