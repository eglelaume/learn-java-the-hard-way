import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Your height (feet only): " );
        double feet = keyboard.nextDouble();

        System.out.print( "Your height (inches): " );
        double inches = keyboard.nextDouble();

        double feetInInches = feet * 12;
        double totalInches = feetInInches + inches;

        System.out.print( "Your weight in pounds: " );
        double pounds = keyboard.nextDouble();

        double kg = pounds / 2.20462;
        double m = totalInches / 39.3701;

        double bmi = kg / (m * m);

        System.out.println( "Your BMI is " + bmi );
    }
}
