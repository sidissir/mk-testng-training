package testngtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterisationUsinDataProvider {
	
	/*
	 * Scenario Outline: To test whether user registration is succesfull 
	 * Given I am on user registration page 
	 * When I enter "<uname>" in user name field 
	 * And I enter "<password>" in password field 
	 * And I enter "<gender>" in gender field
	 * And I enter <age> in age field 
	 * And I click create account button 
	 * Then Account creation should be successfull
	 * 
	 * Examples: 
	 * | uname | password | gender | age | 
	 * | praveena | password1 | female | 31 | 
	 * | Ankitha | password2 | female | 31 | 
	 * | Siddu | password3 | male | 31| 
	 * | Ramya | password4 | female | 31 |
	 */
	
	@DataProvider(name = "femaleUserDataProvider")
	public Object[][] getData() {
		
		Object[][] testDataAr = new Object[3][4]; 
		
		testDataAr[0][0] = "praveena" ;
		testDataAr[0][1] = "female";
		testDataAr[0][2] = "password1";
		testDataAr[0][3] = 31;
		
		testDataAr[1][0] = "Ankitha" ;
		testDataAr[1][1] = "female";
		testDataAr[1][2] = "password2";
		testDataAr[1][3] = 31;
		
		
		testDataAr[2][0] = "ramya" ;
		testDataAr[2][1] = "female";
		testDataAr[2][2] = "password3";
		testDataAr[2][3] = 31;
		

		return testDataAr;
		
	}
	
	@BeforeMethod
	public void befMethod() {
		System.out.println("=================================I am Before Method ====================================");
		//System.setProperties("webdriver.chrome.driver","locationofchromedriver.exe");
				//WebDriver driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void AfMethod() {
		System.out.println("=================================I am After Method ====================================");
		//driver.quit();
	}
	
	
	
	
	@Test(dataProvider = "femaleUserDataProvider")
	public void userRegistrationTest(String userName,String password,String gender,int age) {
		
		System.out.println("Opened browser");
		System.out.println("Navigated to registration page");
		System.out.println("In username field ,Entered : " + userName);
		System.out.println("In password field, entered : "+ password);
		System.out.println("In gender field, entered : " + gender);
		System.out.println("In age field, entered : " + age);
		System.out.println("Clicked create account button");
		System.out.println("Verified that account got created");

	}
	
	

}
