package ca.nait.dmit.domain;

/**
 * This class is used to calculate the maximum monthly payment 
 * for a mortgage when given the monthly income and the monthly debt.
 * @author Sam Wu
 * @version 2007.01.15
 */
public class HouseRules {

	/** Constant used to calculate the monthly payment without debt */
	private final double WITHOUT_DEBT = 0.28;
	/** Constant used to calcualte the monthly payment with debt */
	private final double WITH_DEBT = 0.36;
	private double monthlyIncome;
	private double monthlyDebt;
	
	public HouseRules() {
		monthlyIncome = 0;
		monthlyDebt = 0;
	}
	
	/**
	 * This method calculates the maximum monthly payment with debt. 
	 * @return The monthly payment amount.
	 */
	public double getMonthlyPaymentWithDebt() {
		return ( WITH_DEBT * monthlyIncome ) - monthlyDebt;
	}
	/**
	 * This method calculates the maximum monthly payment without debt.
	 * @return The monthly payment amount.
	 */
	public double getMonthlyPaymentWithoutDebt() {
		return WITHOUT_DEBT * monthlyIncome;
	}
	
	public double getMonthlyDebt() {
		return monthlyDebt;
	}
	public void setMonthlyDebt(double monthlyDebt) {
		this.monthlyDebt = monthlyDebt;
	}
	public double getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
}







