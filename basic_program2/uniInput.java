import java.util.Scanner;
class uni{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fees");
		double fees = sc.nextInt();
		System.out.println("Enter discount percentage");
		double discountPercentage = sc.nextInt();
		double discountVariable = (discountPercentage/100)*fees;
		double finalAmount = fees - discountVariable;
		System.out.println("Final amount to be paid "+ finalAmount);
		System.out.println("discounted amount "+ discountVariable);
	    
		
		
	}
}