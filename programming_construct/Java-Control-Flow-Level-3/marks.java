import java.util.Scanner;
class Marks{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics marks");
		int phy = sc.nextInt();
		System.out.println("Enter Chemistry marks");
		int chem = sc.nextInt();
		System.out.println("Enter Mathematics marks");
		int math = sc.nextInt();
		int percentage = (phy+ chem + math ) * 100 / 300;
		if(percentage>=80 && percentage<=100){
			System.out.println("Grade A, Level 4 (above agency normalised-stanadards)" + percentage + "%");
		} else if(percentage>=70 && percentage<=79){
			System.out.println("Grade B, Level 3 (at agency normalised-stanadards)" + percentage + "%");
		} else if(percentage>=60 && percentage<=69){
			System.out.println("Grade C, Level 2 (below but approaching agency-normalised stanadards)" + percentage + "%");
		} else if(percentage>=50 && percentage<=59){
			System.out.println("Grade D, Level 1 (well below agency-normalised stanadards)" + percentage + "%");
		} else if(percentage>=40 && percentage<=49){
			System.out.println("Grade E, Level 1- (too below agency-normalised stanadards)" + percentage + "%");
		} else {
			System.out.println("Grade R, Remedial Standards" + percentage + "%");
		}
	}
}