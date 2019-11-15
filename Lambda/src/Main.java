
public class Main {

	public static void main(String[] args) {
		
		//�Ű������� ���๮���� �ۼ�
		LambdaInterface1 li1 = (String s1, String s2, String s3) ->
		{ System.out.println(s1+" "+s2+" "+s3);}; 
		li1.method("Hello", "java", "World");
		System.out.println();
		//����
		LambdaInterface2 li2 = (S1) ->{System.out.println(S1);};
		li2.method("Hello");
		System.out.println();
		//���๮�� 1���� �� {}����
		LambdaInterface2 li3 = (s1) ->System.out.println(s1);
		li3.method("Hello");
		System.out.println();
		//�Ű������� ���๮�� 1���� �� (),{} ���� ����
		LambdaInterface2 li4 = s1 -> System.out.println(s1);
		li4.method("Hello");
		System.out.println();
		//�Ű������� ������ ()�� ���
		LambdaInterface3 li5 = () -> System.out.println("noparameter");
		li5.method();
		System.out.println();
		//��ȯ���� �ִ°��
		LambdaInterface4 
			li6 = (x,y) ->{
				int result = x+y;
				return result;
				};
				System.out.printf("li6.method(10,20) : %d\n",li6.method(10, 20));
			
			li6 = (x,y) ->{
				int result = x*y;
				return result;
				};
				System.out.printf("li6.method(10,20) : %d\n",li6.method(10, 20));
				
			li6 = (x,y) ->{
				int result = x-y;
				return result;
				};
				System.out.printf("li6.method(10,20) : %d\n",li6.method(10, 20));
					
		}
		
	}


