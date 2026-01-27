import java.util.Scanner;
class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the weight ");
		double kg = sc.nextDouble();
		System.out.println("enter the height ");
		double height =sc.nextDouble();
		double meter = height /100;
		double BMI = (kg/(meter*meter));
		System.out.println("body mass index is: "+BMI);
		if (BMI<=18.4){
			System.out.println("Underweight");
		}
		else if (BMI>18.5 && BMI<=24.9){
			System.out.println("Normal");
		}
		else if (BMI>25.0 && BMI<=39.9){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
	}
}