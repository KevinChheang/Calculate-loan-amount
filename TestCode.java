import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {
		Loan loan = new Loan();
		
		loan.calculateLoan();
	}

}

class Loan {
	void calculateLoan () {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter annual interest rate: eg. 3.5");
		double annualInterestRate = input.nextDouble();
		
		// Calculate monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		System.out.println("Enter number of year: eg. 25");
		int loanPeriodInYear = input.nextInt();
		
		System.out.println("Enter loan amount: eg. 100000");
		double loanAmount = input.nextDouble();
		
		// Calculate montyly payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / 
					Math.pow(1 + monthlyInterestRate, loanPeriodInYear * 12));
		
		// Calculate total payment
		double totalPayment = monthlyPayment * 12 * loanPeriodInYear;
		
		System.out.println("Loan amount = $" + loanAmount);
		System.out.println("Annual interest = %" + annualInterestRate);
		System.out.println("Loan period in year =" + loanPeriodInYear);
		System.out.println("Monthly payment = $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("Total payment = $" + (int)(totalPayment * 100) / 100.0);
	}
}
