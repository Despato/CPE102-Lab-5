
public class CashRegisterTester {
	public static void main(){
		CashRegister nerd = new CashRegister(10.01);
		double tot = nerd.purchase$$$(1, 0, 0, 40);
		System.out.println("Expected: 0");
		System.out.println("Actual: " + tot);
	}
}