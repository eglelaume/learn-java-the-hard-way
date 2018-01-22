import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Your height in inches: " );
        double inches = keyboard.nextDouble();

        System.out.print( "Your weight in pounds: " );
        double pounds = keyboard.nextDouble();

        double kg = pounds / 2.20462;
        double m = inches / 39.3701;

        double bmi = kg / (m * m);

        System.out.println( "Your BMI is " + bmi );
    }
}
