import java.util.Scanner;
class odd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1;i<=n;i++){
			if(i%2==0){
				System.out.println("The even number is " + i);
			} else {
				System.out.println("The odd number is " + i);
			}
		}
	}
}