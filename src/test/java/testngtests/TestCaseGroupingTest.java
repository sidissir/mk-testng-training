package testngtests;

import org.testng.annotations.Test;

public class TestCaseGroupingTest {

	@Test(groups = { "AuthenticationTests" , "SmokeTests" })
	public void loginTest() {
		System.out.println("I am loginTest");
	}

	@Test(groups = { "AuthenticationTests" , "SmokeTests" })
	public void logOutTest() {
		System.out.println("I am logOutTest");

	}

	@Test(groups = { "AuthenticationTests" ,"IntegrationTest" })
	public void forgotPasswordTest() {
		System.out.println("I am forgotPasswordTest");

	}

	@Test(groups = { "CartTests", "SmokeTests"  })
	public void addToCartTest() {
		System.out.println("I am addToCartTest");

	}

	@Test(groups = { "CartTests", "SmokeTests"  })
	public void deleteFromCartTest() {
		System.out.println("I am deleteFromCartTest");

	}

	@Test(groups = { "CartTests" ,"IntegrationTest"})
	public void addMultipleItemsToCartTest() {
		System.out.println("I am addMultipleItemsToCartTest");

	}

	@Test(groups = { "CartTests","IntegrationTest" })
	public void deleteMultipleItemsFromCartTest() {
		System.out.println("I am deleteMultipleItemsFromCartTest");

	}
}
