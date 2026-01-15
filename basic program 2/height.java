import java.util.Scanner;
class height{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height in cm");
		double height = sc.nextInt();
		double inch = height/2.54;
		double feet = inch/12;
		System.out.println("your height in cm is "+ height+"your height in inches is"+inch+"your height in feet is "+feet);
		
	}
}
