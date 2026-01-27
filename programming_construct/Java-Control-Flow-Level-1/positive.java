import java.util.Scanner;
class largest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num >=1){
			System.out.println("Positive");
		}
		else if(num<=-1){
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
			
		}
		
	}
}