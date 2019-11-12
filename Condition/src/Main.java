import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		//if문
		if(n1<n2) {
			System.out.println("n1 은 n2 보다 작다");
		}
		System.out.println();
		//if else문
		n1=20;
		n2=10;
		if(n1<n2) {
			System.out.println("n1 은 n2 보다 작다");
		}else {
			System.out.println("n1 은 n2 보다 크거나 같다");
		}
		System.out.println();
		//if else if문
		n1=n2;
		if(n1<n2) {
			System.out.println("n1 은 n2 보다 작다");
		}else if(n1>n2) {
			System.out.println("n 은 n2 보다 크다");
		}else {
			System.out.println("n1 과 n2 는 같다");
		}
		System.out.println();
		System.out.println();

		//switch문
		System.out.printf("점수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		switch(score) {
		case 100:
		case 90:
			System.out.println("수");
			break;
		case 80:
			System.out.println("우");
			break;
		case 70:
			System.out.println("미");
			break;
			
			default:
				System.out.println("try again");
				break;
		}
		
	}

}
