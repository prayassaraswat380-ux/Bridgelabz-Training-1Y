import java.util.Scanner;
class greatestFactor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int greatest_factor = 1;
		int i = n-1;
		if(n>=0){
			while(i >=1){
				if (n%i==0){
					System.out.println(i);
						greatest_factor = i;
						break ;
				} i--;
		} 
	}  else {
			System.out.println("Enter a positive number");	
		} System.out.println("The greatest factor is " + greatest_factor);
}
}