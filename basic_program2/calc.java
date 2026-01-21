import java.util.Scanner;
class calc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value 1");
		double val1 = sc.nextInt();
		System.out.println("Enter value 2");
		double val2 = sc.nextInt();
		double add = val1+val2;
		double sub = val1-val2;
		double mult = val1*val2;
		double div = val1/val2;
		System.out.println("addition "+ add + "subtraction" + sub + "multiplication" + mult + "division" + div);
		
	}
}
