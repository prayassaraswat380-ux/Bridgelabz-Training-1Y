import java.util.Scanner;
class Multiple{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n>0&&n<100){
			for(int i = 100;i >=1;i--){
				if (i%n==0){
					System.out.println(i);
				}
		} 
	}  else {
			System.out.println("Enter a positive number");	
		} 
}
}