import java.util.Scanner;
class Addition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cp ");
		int cp = sc.nextInt();
		System.out.println("Enter sp");
		int sp = sc.nextInt();
		
		int profit = cp-sp;
		int percentage = profit*100/cp;
		
		
		System.out.println("Profit is  "+ profit);
		System.out.println("Profit percentage is "+ percentage);
	}
}