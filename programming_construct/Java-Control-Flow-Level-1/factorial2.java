import java.util.Scanner;
class zero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = 1;
		if (n>0){
			for (int i = 1; i<=n;i++){
				factorial = factorial*i;
			} 
			} else {
				System.out.println("The number entered is not positive");
		}
		System.out.println(factorial);

		
	}
}