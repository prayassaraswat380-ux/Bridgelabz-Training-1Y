import java.util.Scanner;
class quotient{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		double  num1 = sc.nextInt();
		System.out.println("Enter number 2");
		double  num2 = sc.nextInt();
		double quotient = num1/num2;
		double remainder = num1%num2;
		
		
		System.out.println("the quotient of two numbers is" + quotient + "the quotient of two numbers is" + remainder);
		
	}
}
