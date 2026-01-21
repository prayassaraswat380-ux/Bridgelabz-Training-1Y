import java.util.Scanner;
class Addition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maths marks");
		int maths = sc.nextInt();
		System.out.println("Enter physics marks");
		int physics = sc.nextInt();
		System.out.println("Enter chemistry marks");
		int chemistry = sc.nextInt();

		int average = maths+physics+chemistry/2;
		
		System.out.println("average marks is "+ average);
	}
}