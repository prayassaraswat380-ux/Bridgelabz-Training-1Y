import java.util.Scanner;
class tri{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		double base = sc.nextInt();
		System.out.println("Enter height");
		double height = sc.nextInt();
		double area = 1%2*base*height;
		System.out.println("the area of triangle is " + area);
		
	}
}
