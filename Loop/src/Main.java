import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//for��
		System.out.print("���ϴ� �� ���� �Է����ּ��� : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d \n",inputNum,i,(inputNum*i));
			
		}
		System.out.println();
		
		//while��
		System.out.print("���ϴ� �� ���� �Է����ּ��� : ");
		int inputNum2 = scanner.nextInt();
		int i = 1;
		while(i<10) {
			System.out.printf("%d * %d = %d\n",inputNum2,i,(inputNum2*i));
			i++;
		}
		System.out.println();
		//do ~ while��
		i=10;
		do {
			System.out.println("������ 1���� ������");
		}while(i>100);
	}

}
