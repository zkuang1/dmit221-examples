package ca.nait.dmit.domain;

/**
 * This class is used to calculate the number of years it takes
 * to double your money using the "rules of 72".
 * @author Sam Wu
 * @version 2007.01.15
 */
public class RulesOf72 {
	private static final int RULE72 = 72;
	/** The annual interest rate (as a percent of 100) at which you earn 
	 * interest on the investment.
	 */
	private double interestRate;

	public RulesOf72() {
		interestRate = 0;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	/**
	 * This method calculates the number of years it takes to double
	 * your money using the rule of 72 and the current interest rate.
	 * @return The number of years to double your money at the current
	 * interest rate.
	 */
	public double getYearsToDouble() {
		return RULE72 / interestRate;
	}
	
}
