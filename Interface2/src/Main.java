
public class Main {

	public static void main(String[] args) {
		ToyAirplane airplane = new ToyAirplane();
		ToyRobot robot = new ToyRobot();
		
		Toy toys[] = {robot,airplane};
		
		for(int i=0; i<toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}
	}

}
