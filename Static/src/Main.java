
public class Main {

	public static void main(String[] args) {
		Bank hongBank = new Bank("ȫ����");
		Bank kimBank = new Bank("�趯��");
		
		hongBank.saveMoney(10000);
		kimBank.saveMoney(15000);
		hongBank.spendMoney(15000);
		kimBank.spendMoney(10000);
		hongBank.getBankInfo();
		kimBank.getBankInfo();
		
	}

}
