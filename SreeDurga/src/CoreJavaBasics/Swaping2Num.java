package CoreJavaBasics;

public class Swaping2Num {

	public static void main(String[] args) {
		// without using third variable
		int a = 10;
		int b = 20;
		System.out.println("Before swapping values are..."+a+" "+b );
		a = a+b; //10+20=30 a=30
		b = a-b; //30-20=10 b=10 current
		a = a-b; //30-10=20 a=20 current
		System.out.println("After swapping values are..."+a+" "+b);

	}

}
