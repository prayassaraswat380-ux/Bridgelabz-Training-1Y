import java.util.Scanner;
class operations{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		System.out.println("Enter value of c");
		int c = sc.nextInt();
		
		int op1 = a + b *c;
		int op2 = a * b + c;
		
		int op3 = a % b + c;
		
		
		System.out.println("=> The results of Int Operations are" + op1 + op2  + op3);
		
	}
}
