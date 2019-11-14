
public abstract class abstractClass {
	int num;
	String str;
	
	public abstractClass() {
		System.out.println("abstractClass constructor");
	}
	
	public abstractClass(int i, String s) {
		System.out.println("abstractClass constructor");
		this.num = i;
		this.str = s;
	}
	public void fun1() {
		System.out.println("--fun1() START--");
	}
	public abstract void fun2();
}
