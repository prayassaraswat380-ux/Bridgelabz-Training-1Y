import java.util.Scanner;
class zero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = 1;
		int i = 1;
		while (n<0){
			System.out.println(factorial);
	}
	while (i<=n){
		factorial = factorial*i;
		i++;
		
	}
	System.out.println(factorial);

		
	}
}
