import java.util.Scanner;
class handshake{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number Of Students");
		double  n = sc.nextInt();
		double totalHankshakes = (n * (n - 1)) / 2;
		
		System.out.println("totalHankshakes combinations that can be done " + totalHankshakes);
		
	}
}
