package testngtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersFromSuiteFile {
	
	@Parameters({ "Category", "SearchTerm","ShoeSize" })
	@Test
	public void  SearchFromSearchBoxWithSelectingCategoryTest(String category, String searchKeyword, int shoeSize) {
		/*
		 * Given I have opened a browser 
		 * And I navigate to home page 
		 * And I select "Shoes and Bags" category 
		 * When I enter "Sports Shoes" in search box 
		 * And I want size 10 shoes 
		 * And I click search button 
		 * Then All shoe products should be displayed
		 */
		System.out.println("I have opened a browser");
		System.out.println("Navigated to Home Page");
		System.out.println("Selected the category : " + category);
		System.out.println("I entered this keyword in search box : " + searchKeyword);
		System.out.println("I want the size : " + shoeSize);
		System.out.println("I clicked search button");
		System.out.println("I verified that all shoe products are displayed");

	}

}
