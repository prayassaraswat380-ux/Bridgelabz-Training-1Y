import java.util.Scanner;
class bonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year of service ");
		int yos = sc.nextInt();
		System.out.println("Enter your salary");
		int salary = sc.nextInt();
		if(yos>=5){
			System.out.println("You'll get a 5 % bonus, and your total salary is " + (salary+(salary/100)));
		} else {
			System.out.println("No bonus for you");
		}
	}
}