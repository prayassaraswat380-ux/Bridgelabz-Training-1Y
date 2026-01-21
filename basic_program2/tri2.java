import java.util.Scanner;
class triangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		double base = sc.nextInt();
		System.out.println("Enter height");
		double height = sc.nextInt();
		double area = 1%2*base*height;
		double inches = area/2.54;
		System.out.println("the area of triangle in cm " + area "area of triangle in inches"+inches);
		
	}
}
