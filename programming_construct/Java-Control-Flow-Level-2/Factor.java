import java.util.Scanner;
class Factor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n>=0){
			for(int i = 1; i<n;i++){
				if (n%i==0){
					System.out.println(i);
				} else{
					System.out.println("Not perfectlty diviible by i" +i);
			}
		} 
	}  else {
			System.out.println("Enter a positive number");	
		}
}