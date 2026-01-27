import java.util.Scanner;
class natural{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n * (n+1) / 2;
		if(n>=1){
			System.out.println("The sum of "+  n  + "natural number is " + sum);
		}
		else {
			System.out.println("n is not a natural number");
		}
		
	}
}