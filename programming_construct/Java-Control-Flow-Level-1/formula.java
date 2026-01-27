import java.util.Scanner;
class zero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int Bywhile = 0;
		int i = 1;
		if (n>0){
			while(i<=n){
				Bywhile = Bywhile + i;
				i++;
			}
			
		} else {
			System.out.println("The entered number is not a natural number ");
		}
        int Byformulae = n * (n + 1) / 2;
		System.out.println("By using while loop " + Bywhile);
		System.out.println("By using formulae " + Byformulae);
		
		if (Bywhile == Byformulae){
			System.out.println("The answer is same by both the methods");
		} else {
			System.out.println("The answer is same by both the methods");
		}

	}
}