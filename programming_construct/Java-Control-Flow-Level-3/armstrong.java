import java.util.Scanner;
class armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum =  0;
		int originalNumber = number;
		while (originalNumber!=0){
			int digit = originalNumber%10;
			sum = sum +(digit*digit*digit);
			originalNumber = originalNumber/10;
		} if(number==sum){
			System.out.println("It is an armstrong number");
		} else {
			System.out.println("It is not an armstrong number");
		}
	}
}