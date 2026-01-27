import java.util.Scanner;
class zero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double total = 0;
		while (num !=0){
			total = total + num;			
			num = sc.nextDouble(); // To update num value not redeclare

		}
		System.out.println(total);
	}
}