import java.util.Scanner;
class largest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3){
			System.out.println("Num1 is the largest");
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("Num2 is the largest");
		}
		else {
			System.out.println("Num3 is the largest");
			
		}
		
	}
}