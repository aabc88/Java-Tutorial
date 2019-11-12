import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//배열선언,초기화
		int[] arr1 = new int[3];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		System.out.println("arr1[0] ="+arr1[0]);
		System.out.println("arr1[1] ="+arr1[1]);
		System.out.println("arr1[2] ="+arr1[2]);
		
		//배열선언초기화 한번에
		int[] arr2 = {10,20,30};
		System.out.println("arr2[0] ="+arr2[0]);
		System.out.println("arr2[1] ="+arr2[1]);
		System.out.println("arr2[2] ="+arr2[2]);
		
		//Scanner를 이용한 배열
		Scanner scanner = new Scanner(System.in);
		String[] name = {"김","이","홍","박"};
		int[] score = new int[5];
		System.out.printf("%s의 점수를 입력하세요 : ",name[0]);
		score[0] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하세요 : ",name[1]);
		score[1] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하세요 : ",name[2]);
		score[2] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하세요 : ",name[3]);
		score[3] = scanner.nextInt();
		System.out.printf("%s의 점수 : \t%.2f\n",name[0], (double)score[0]);
		System.out.printf("%s의 점수 : \t%.2f\n",name[1], (double)score[1]);
		System.out.printf("%s의 점수 : \t%.2f\n",name[2], (double)score[2]);
		System.out.printf("%s의 점수 : \t%.2f\n",name[3], (double)score[3]);
		double d = (double)(score[0]+score[1]+score[2]+score[3])/4;
		System.out.printf("------------\n 평점 : \t%.2f",d);
		scanner.close();
		System.out.println();
		System.out.println("------------");
		
		//배열 속성
		int[] arrAtt1 = {10,20,30,40,50};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		//배열 길이
		System.out.println("arrAtt1.length ="+arrAtt1.length);
		//배열 요소 출력
		System.out.println("arrAtt1 ="+Arrays.toString(arrAtt1));
		//배열 요소 복사
		arrAtt3 = Arrays.copyOf(arrAtt1,arrAtt1.length);
		System.out.println("arrAtt3 ="+Arrays.toString(arrAtt3));
		//배열 레퍼런스
		arrAtt2=arrAtt1;
		System.out.println("arrAtt1 ="+arrAtt1);
		System.out.println("arrAtt2 ="+arrAtt2);
		System.out.println("arrAtt3 ="+arrAtt3);
		//다차원 배열
		int[][] arrMul= new int[2][2];
		arrMul[0][0] =10;
		arrMul[0][1] =100;
		arrMul[1][0] =20;
		arrMul[1][1] =200;
		System.out.println("arrMul[0] ="+Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] ="+Arrays.toString(arrMul[1]));
		
		

	}

}
