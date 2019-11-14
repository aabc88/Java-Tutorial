
public class classEx extends abstractClass {

	public classEx() {
		System.out.println("classEx coonstructor");
	}
	
	public classEx(int i,String s) {
		super(i,s);
	}
	
	@Override
	public void fun2() {
		System.out.println("--fun2() START--");
	}

}
