package ca.nait.dmit.domain;

import org.junit.Test;

import junit.framework.TestCase;

public class RulesOf72Test extends TestCase {

	@Test
	public void testHighInterestRate() {
		// create an instance of the class to test
		RulesOf72 bean = new RulesOf72();
		// set the interest rate to 12.5%
		bean.setInterestRate(12.5);
		// check if the number of years to double is 5.76.
		assertEquals( 5.76, bean.getYearsToDouble(), 0.001);			
	}
	
	@Test
	public void testMediumInterestRate() {
		// create an instance of the class to test
		RulesOf72 bean = new RulesOf72();
		// set the interest rate to 8%
		bean.setInterestRate(8);
		// check if the number of years to double is 9.
		assertEquals( 9, bean.getYearsToDouble(), 0);			
	}
	
	@Test
	public void testLowInterestRate() {
		// create an instance of the class to test
		RulesOf72 bean = new RulesOf72();
		// set the interest rate to 4%
		bean.setInterestRate(4);
		// check if the number of years to double is 18.
		assertEquals( 18, bean.getYearsToDouble(), 0);			
	}

}
