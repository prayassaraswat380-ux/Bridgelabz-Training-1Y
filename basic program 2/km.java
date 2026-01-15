import java.util.Scanner;
class Addition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter km ");
		int km = sc.nextInt();
		int miles = 1*km*1.6;
		
		
		System.out.println(" conversion is "+miles);
	}
}