package testngtests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseGroupingTest {

	
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
	
	
	
	@BeforeClass
	public void befClass() {
		System.out.println("==========================================I am Before Class==============================================");
	}
	
	@AfterClass
	public void AfClass() {
		System.out.println("==========================================I am After Class===================== ==========================");
	}
	
	
	@BeforeTest
	public void befTest() {
		System.out.println("========================================================I am Before Test ===========================================================");
	}
	
	@AfterTest
	public void AfTest() {
		System.out.println("========================================================I am After Test ===========================================================");
	}
	
	@BeforeSuite
	public void befSuite() {
		System.out.println("==================================================================I am Before Suite =====================================================================");
		//Connecting to databases
		//Reading configuration files
		// Recording starting time
		// Sending out email to every one that automation suite execution has started
	}
	
	@AfterSuite
	public void AfSuite() {
		System.out.println("==================================================================I am After Suite =====================================================================");
		//Closing database connections
		// Recording ending time => Calculate total execution time
		// Generating test suite execution reports
		// Emailing reports to stake holders 
	}
	
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
