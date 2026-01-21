import java.util.Scanner;
class yards{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance is feets");
		double feets = sc.nextInt();
		double yards = feets/3;
		double miles = yards/1760;
		System.out.println("distance in yards is "+ yards + "distance in miles is" + miles);
		
	}
}
