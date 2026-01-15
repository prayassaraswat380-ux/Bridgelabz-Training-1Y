import java.util.Scanner;
class harry{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("your birth year");
		int birthyear = sc.nextInt();
		int currentyear = sc.nextInt();
	    System.out.print("enter current year");
		int age = currentyear - birthyear;
		
		System.out.print("your age is");
		System.out.print(age);
	}
}