import java.util.Scanner;
class largest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		if (month < 1 || month > 12 || day < 1 || day > 31 ||
            ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)) {
            System.out.println("Invalid date");
        }
		else if(month ==3 && day >=20 ||month ==4 || month == 5 ||month <=6  &&day<=20){
			System.out.println("It is a spring Season");
		}
		else {
			System.out.println("Its not a spring season");
			
		}
		
	}
}