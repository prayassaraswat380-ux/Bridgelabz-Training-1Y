import java.util.Scanner;
class power{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Enter power");
		int power = sc.nextInt();
		int result = 1;
		int i =1;
		if(power>0){
			while(i <= power){
				result = result*n;
				i++;
				}
		} else {
			System.out.println("Enter a positive number");	
		} System.out.println("The power of number is" + result);  
	}  
} 
