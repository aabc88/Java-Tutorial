
public class myBank extends Bank {
	public myBank(String name, String account, int totalAmount) {
		super(name,account,totalAmount);
	}

	@Override
	public void installmentSavings() {
		System.out.println("--installmentSaving() START--");
	}

	@Override
	public void cancellation() {
		System.out.println("--cancellation() START--");
	}
}
