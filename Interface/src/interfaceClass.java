
public class interfaceClass implements interfaceA, interfaceB {

	public interfaceClass() {
		System.out.println("--interfaceClass constructor--");
	}
	
	@Override
	public void funB() {
		System.out.println("--funA()--");
	}

	@Override
	public void funA() {
		System.out.println("--funB()--");

	}
	
}
