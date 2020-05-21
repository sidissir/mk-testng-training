package testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseDependencyManagement {

	// Every test should be independent

	@Test
	public void loginTest() {
		System.out.println("I am loginTest");

		// Open browser
		// Go to login page
		// Login with valid credentials
		// Verify that login is succesfull
		Assert.assertEquals("something", "somethingelse", "Login functionality is not working.");
	}

	@Test(dependsOnMethods = { "loginTest" })
	public void logOutTest() {
		//	Open browser
		// Go to login page
		// Login with valid credentials
		// click logout
		// Verify that logout is successfull
		System.out.println("I am logOutTest");

	}

	@Test
	public void forgotPasswordTest() {
		System.out.println("I am forgotPasswordTest");

	}

	@Test(dependsOnMethods = { "loginTest" })
	public void addToCartTest() {
		// Open browser
		// Go to login page
		// Login with valid credentials
		// search
		// Add to cart
		// Verify that item is added to the cart
		System.out.println("I am addToCartTest");

	}

	@Test(dependsOnMethods = { "loginTest" })
	public void deleteFromCartTest() {
		System.out.println("I am deleteFromCartTest");

	}

	@Test(dependsOnMethods = { "loginTest" })
	public void addMultipleItemsToCartTest() {
		System.out.println("I am addMultipleItemsToCartTest");

	}

	@Test(dependsOnMethods = { "loginTest" })
	public void deleteMultipleItemsFromCartTest() {
		System.out.println("I am deleteMultipleItemsFromCartTest");

	}
}
