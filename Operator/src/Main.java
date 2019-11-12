
public class Main {

	public static void main(String[] args) {
		
		//산술연산자
		int x = 10; int y =20;
		System.out.println("x+y ="+(x+y));
		System.out.println("x-y ="+(x-y));
		System.out.println("x/y ="+(x/y));
		System.out.println("x*y ="+(x*y));
		System.out.println("X%y ="+(x%y));
		
		//복합대입연산자
		x=10;
		System.out.println("x+=10 ="+(x+=10));
		x=10;
		System.out.println("x-=10 ="+(x-=10));
		x=10;
		System.out.println("x*=10 ="+(x*=10));
		x=10;
		System.out.println("x/=10 ="+(x/=10));
		x=10;
		System.out.println("x%=10 ="+(x%=10));
		
		//관계연산자
		x=10; y=20; 
		System.out.println("x>y ="+(x>y));
		System.out.println("x<y ="+(x<y));
		System.out.println("x>=y ="+(x>=y));
		System.out.println("x<=y ="+(x<=y));
		System.out.println("x==y ="+(x==y));
		System.out.println("x!=y ="+(x!=y));
		
		//증감연산자
		x=10;
		System.out.println("++x ="+(++x));
		x=10;
		System.out.println("--x ="+(--x));
		x=10;
		System.out.println("x++ ="+(x++));
		System.out.println("x = "+x);
		x=10;
		System.out.println("x-- ="+(x--));
		System.out.println("x ="+x);
		
		//논리연산자
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 ="+(b1&&b2)); //and
		System.out.println("b1 || b2 ="+(b1||b2)); //or
		System.out.println("!b1 ="+!b1); //not
		System.out.println("!b2 ="+!b2); //not
		
		//조건연산자
		x=10; y=20;
		int result = 0;
		result = (x>y)? 100:200;
		System.out.println("result ="+result);
		result = (x<y)? 100:200;
		System.out.println("result ="+result);
		result = (x==y)? 100:200;
		System.out.println("result ="+result);

		
		
		
		
	}

}
