
public class CashRegister {
	public double amntDue = 0;
	public CashRegister(double due){
		amntDue = due;
	}
	public double purchase$$$(int pennies, int nickels, int dimes, int quarters){
		double paid = pennies * MonetaryUnit.PENNY + nickels * MonetaryUnit.NICKEL + dimes * MonetaryUnit.DIME + quarters * MonetaryUnit.QUARTER; 
		return paid - amntDue;
	}
}
