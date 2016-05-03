
public class CashRegisterTester {
	public static void main(String[] args){
		CashRegister nerd = new CashRegister(8.99);
		System.out.println("Expected: 1.0");
		System.out.println("Actual: " + nerd.purchase$$$(1, 0, 0, 40));
	}
}