
public class UnitConvertor3 {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3*yards;
        return yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333*feet;
        return feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701*meters;
        return meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254*inches;
        return inches2meters ;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54*inches;
        return inches2cm;
    }

    public static void main(String[] args) {
		UnitConvertor3 c1=new UnitConvertor3 ();
		System.out.println(c1.convertYardsToFeet(10.0));
		System.out.println(c1.convertFeetToYards(10.0));
		System.out.println(c1.convertMetersToInches(10.0));
		System.out.println(c1.convertInchesToMeters(10.0));
		System.out.println(c1.convertInchesToCentimeters(10.0));
    }
}
