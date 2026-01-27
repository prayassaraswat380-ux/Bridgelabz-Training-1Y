import java.util.Scanner;
class armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int number = sc.nextInt();
		int count =  0;
		int originalNumber = number;
		while (originalNumber!=0){
			int digit = originalNumber%10;
			originalNumber = originalNumber/10;
			count++;
		} System.out.println(count);
	}
}