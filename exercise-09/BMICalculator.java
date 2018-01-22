import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Your height in m: " );
        double m = keyboard.nextDouble();

        System.out.print( "Your weight in kg: " );
        double kg = keyboard.nextDouble();

        double bmi = kg / (m * m);

        System.out.println( "Your BMI is " + bmi );
    }
}
