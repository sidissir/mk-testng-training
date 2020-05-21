package testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest1 {
			
	
	@Test
	public void additionToCartTest() {
		
		//When an item is added to empty cart
		
		int expectedNumberOfItemsInCart = 1; // Expected Value is read from properties file
		System.out.println(expectedNumberOfItemsInCart);
		
		System.out.println("Opening Home page");// Using selenium open home page in browser .driver.get("www.amazon.uk")
		
		System.out.println("Search for aproduct "); // using selenium, Locate search box,using send keys enter search term , locate search Button,click search button
		System.out.println("Add product to cart");
		System.out.println("Get the number of items present in tha cart");
		int actualNumberOfItemsInCart = 0; // using selenium, i will get the count of elements in the cart 
		System.out.println(actualNumberOfItemsInCart);


		System.out.println("Verify number of items in the cart is 1");
		Assert.assertEquals(actualNumberOfItemsInCart, expectedNumberOfItemsInCart);
		
	}
	
	@Test
	public void deletingFromCartTest() {
		//deleting all items in cart should make the cart empty
		int expectedNumberOfItemsInCart = 0; // Expected Value is read from properties file
		System.out.println(expectedNumberOfItemsInCart);
		
		System.out.println("Opening Home page");// Using selenium 
		
		System.out.println("Go to cart page "); // using selenium, 
		System.out.println("delete all items from cart"); //Using selenium
		System.out.println("Get the number of items present in the cart"); // Using Selenium
		int actualNumberOfItemsInCart = 3; // using selenium
		System.out.println(actualNumberOfItemsInCart);

		System.out.println("Verify number of items in the cart is 0");
		Assert.assertEquals(actualNumberOfItemsInCart, expectedNumberOfItemsInCart);
	}
	
	
	
	
	
	
	
	
	
	
	
}
