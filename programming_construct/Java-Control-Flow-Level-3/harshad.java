import java.util.Scanner;
class harshad{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		int ogNum = num;
		while (ogNum!=0){
			int digit = ogNum%10;
			sum = sum+digit;
			ogNum = ogNum/10;
		} if(num % sum ==0){
			System.out.println("The number is Harshad number");
		} else {
			System.out.println("The number is not Harshad number");
		}
	}
}