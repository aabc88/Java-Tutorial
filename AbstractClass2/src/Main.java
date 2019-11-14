
public class Main {

	public static void main(String[] args) {
		Bank myBank = new myBank("È«ÀÇÁ¤","123-1234-1234",10000);

		myBank.deposit();
		myBank.withdraw();
		myBank.installmentSavings();
		myBank.cancellation();
		
		System.out.println();
		
		myBank.getInfo();
	}

}
