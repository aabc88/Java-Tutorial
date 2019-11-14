
public class Bank {
	String name;
	static int amount = 0;

	public Bank(String name) {
		this.name = name;
	}
	public void saveMoney(int money) {
		amount+=money;
		System.out.println(name+" saveMoney : "+money);
		System.out.println("amount : "+amount);

	}
	public void spendMoney(int money) {
		amount-=money;
		System.out.println(name+" spendMoney : "+money);
		System.out.println("amount : "+amount);
	}
	public void getBankInfo() {
		System.out.println("Employee name : "+this.name);
		System.out.println("amount : "+amount);
	}
}