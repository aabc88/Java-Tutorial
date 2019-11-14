
public class Main {

	public static void main(String[] args) {
		Bank hongBank = new Bank("È«ÀÇÁ¤");
		Bank kimBank = new Bank("±è¶¯¶¯");
		
		hongBank.saveMoney(10000);
		kimBank.saveMoney(15000);
		hongBank.spendMoney(15000);
		kimBank.spendMoney(10000);
		hongBank.getBankInfo();
		kimBank.getBankInfo();
		
	}

}
