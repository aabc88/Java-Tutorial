import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//�迭����,�ʱ�ȭ
		int[] arr1 = new int[3];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		System.out.println("arr1[0] ="+arr1[0]);
		System.out.println("arr1[1] ="+arr1[1]);
		System.out.println("arr1[2] ="+arr1[2]);
		
		//�迭�����ʱ�ȭ �ѹ���
		int[] arr2 = {10,20,30};
		System.out.println("arr2[0] ="+arr2[0]);
		System.out.println("arr2[1] ="+arr2[1]);
		System.out.println("arr2[2] ="+arr2[2]);
		
		//Scanner�� �̿��� �迭
		Scanner scanner = new Scanner(System.in);
		String[] name = {"��","��","ȫ","��"};
		int[] score = new int[5];
		System.out.printf("%s�� ������ �Է��ϼ��� : ",name[0]);
		score[0] = scanner.nextInt();
		System.out.printf("%s�� ������ �Է��ϼ��� : ",name[1]);
		score[1] = scanner.nextInt();
		System.out.printf("%s�� ������ �Է��ϼ��� : ",name[2]);
		score[2] = scanner.nextInt();
		System.out.printf("%s�� ������ �Է��ϼ��� : ",name[3]);
		score[3] = scanner.nextInt();
		System.out.printf("%s�� ���� : \t%.2f\n",name[0], (double)score[0]);
		System.out.printf("%s�� ���� : \t%.2f\n",name[1], (double)score[1]);
		System.out.printf("%s�� ���� : \t%.2f\n",name[2], (double)score[2]);
		System.out.printf("%s�� ���� : \t%.2f\n",name[3], (double)score[3]);
		double d = (double)(score[0]+score[1]+score[2]+score[3])/4;
		System.out.printf("------------\n ���� : \t%.2f",d);
		scanner.close();
		System.out.println();
		System.out.println("------------");
		
		//�迭 �Ӽ�
		int[] arrAtt1 = {10,20,30,40,50};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		//�迭 ����
		System.out.println("arrAtt1.length ="+arrAtt1.length);
		//�迭 ��� ���
		System.out.println("arrAtt1 ="+Arrays.toString(arrAtt1));
		//�迭 ��� ����
		arrAtt3 = Arrays.copyOf(arrAtt1,arrAtt1.length);
		System.out.println("arrAtt3 ="+Arrays.toString(arrAtt3));
		//�迭 ���۷���
		arrAtt2=arrAtt1;
		System.out.println("arrAtt1 ="+arrAtt1);
		System.out.println("arrAtt2 ="+arrAtt2);
		System.out.println("arrAtt3 ="+arrAtt3);
		//������ �迭
		int[][] arrMul= new int[2][2];
		arrMul[0][0] =10;
		arrMul[0][1] =100;
		arrMul[1][0] =20;
		arrMul[1][1] =200;
		System.out.println("arrMul[0] ="+Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] ="+Arrays.toString(arrMul[1]));
		
		

	}

}
