package testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExamplesTests {

	@Test(enabled = false)
	public void assertionEqualsTest() {
		System.out.println("Write all your test code here");

		String expctedStringValue = "Something";
		String actualStringValue = "Somethingelse";

		boolean expctedBoolValue = true;
		boolean actualBoolValue = true;

		double expectedDoubleValue = 12.34;
		double actualDoubleValue = 12.34;

		char expectedCharValue = 'a';
		char actaulCharValue = 'a';

		// Compare actual vs expected
		System.out.println("Assertion 1");

		//Assert.assertEquals(actualStringValue, expctedStringValue);
		Assert.assertEquals(actualStringValue, expctedStringValue,"I am a failure message : Titles are not matching");


		System.out.println("Assertion 2");

		Assert.assertEquals(actualBoolValue, expctedBoolValue);

		System.out.println("Assertion 3");

		Assert.assertEquals(actualDoubleValue, expectedDoubleValue);
		System.out.println("Assertion 4");

		Assert.assertEquals(actaulCharValue, expectedCharValue);
		
	
	}
	
	@Test
	public void assertionNotEqualsTest() {
		System.out.println("Write all your test code here");

		String expctedStringValue = "Something";
		String actualStringValue = "Something";

		
		Assert.assertNotEquals(expctedStringValue, actualStringValue,"I am failure Message : Titles should not match biut they are matching. ");
		
	
	}
}
