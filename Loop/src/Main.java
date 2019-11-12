import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//for문
		System.out.print("원하는 단 수를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d \n",inputNum,i,(inputNum*i));
			
		}
		System.out.println();
		
		//while문
		System.out.print("원하는 단 수를 입력해주세요 : ");
		int inputNum2 = scanner.nextInt();
		int i = 1;
		while(i<10) {
			System.out.printf("%d * %d = %d\n",inputNum2,i,(inputNum2*i));
			i++;
		}
		System.out.println();
		//do ~ while문
		i=10;
		do {
			System.out.println("무조건 1번은 실행함");
		}while(i>100);
	}

}
