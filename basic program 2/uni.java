import java.util.Scanner;
class uni{
	public static void main(String args[]){
		double fees = 125000;
		double discountPercentage = 10;
		double discountVariable = (discountPercentage/100)*fees;
		double finalAmount = fees - discountVariable;
		System.out.println("Final amount to be paid "+ finalAmount);
		System.out.println("discounted amount "+ discountVariable);
	    
		
		
	}
}