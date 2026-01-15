import java.util.Scanner;
class Addition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pen ");
		int pen = sc.nextInt();
		System.out.println("Enter student ");
		int student = sc.nextInt();
		
		int que = pen/student;
		int rem = pen%student;


		
		
		System.out.println(" your rem is "+ rem);
		System.out.println(" your que is "+que);
	}
}