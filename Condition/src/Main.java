import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		//if��
		if(n1<n2) {
			System.out.println("n1 �� n2 ���� �۴�");
		}
		System.out.println();
		//if else��
		n1=20;
		n2=10;
		if(n1<n2) {
			System.out.println("n1 �� n2 ���� �۴�");
		}else {
			System.out.println("n1 �� n2 ���� ũ�ų� ����");
		}
		System.out.println();
		//if else if��
		n1=n2;
		if(n1<n2) {
			System.out.println("n1 �� n2 ���� �۴�");
		}else if(n1>n2) {
			System.out.println("n �� n2 ���� ũ��");
		}else {
			System.out.println("n1 �� n2 �� ����");
		}
		System.out.println();
		System.out.println();

		//switch��
		System.out.printf("������ �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		switch(score) {
		case 100:
		case 90:
			System.out.println("��");
			break;
		case 80:
			System.out.println("��");
			break;
		case 70:
			System.out.println("��");
			break;
			
			default:
				System.out.println("try again");
				break;
		}
		
	}

}
