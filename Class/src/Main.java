
public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.gear = "auto";
		myCar.price = 1000000000;
		
		myCar.info();
		
		Car myCar2 = new Car();
		myCar2.color = "yellow";
		myCar2.gear = "non-auto";
		myCar2.price = 300000000;
	
		myCar2.info();
	}	

}
