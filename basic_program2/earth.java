import java.util.Scanner;
class earth{
	public static void main(String args[]){
		double r = 6378;
		double pi = 22/7;
		double volSphere = 4/3*pi*r*r*r;
		System.out.println("volume of earth in km is "+ volSphere);
		System.out.println("volume of earth in miles is "+ volSphere*1.6);
	}
}