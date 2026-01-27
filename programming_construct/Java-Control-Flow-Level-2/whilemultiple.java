import java.util.Scanner;
class multiple{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i = 100;
		if(n>0&&n<100){
			while(i >=1){
				if (i%n==0){
					System.out.println(i);
				} i--;
		} 
	}  else {
			System.out.println("Enter a positive number");	
		} 
}
}