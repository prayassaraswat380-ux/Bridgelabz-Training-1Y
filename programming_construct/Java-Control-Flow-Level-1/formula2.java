import java.util.Scanner;
class zero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int Byfor = 0;
		if (n>0){
			for(int i =1;i<=n;i++){
				Byfor = Byfor + i;
			}
			
		} else {
			System.out.println("The entered number is not a natural number ");
		}
        int Byformulae = n * (n + 1) / 2;
		System.out.println("By using while loop " + Byfor);
		System.out.println("By using formulae " + Byformulae);
		
		if (Byfor == Byformulae){
			System.out.println("The answer is same by both the methods");
		} else {
			System.out.println("The answer is same by both the methods");
		}

	}
}