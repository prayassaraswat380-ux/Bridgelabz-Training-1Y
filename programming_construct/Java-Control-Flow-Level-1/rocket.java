import java.util.Scanner;
class rocket{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		while (i>=1){
			System.out.println(i--);
		}
	}
}