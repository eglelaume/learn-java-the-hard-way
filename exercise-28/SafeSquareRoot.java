import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x,y;
        String expectedAnswer = "yes";
        String answer = null;

        System.out.println("Are you ready??");
        answer = keyboard.next();

        while (!expectedAnswer.equals(answer)) {
            System.out.println("I am asking - are you READY?");
            answer = keyboard.next();
        }

        System.out.print("Give me a number, and I'll find its square root. ");
        System.out.print("(No negatives, please.) ");
        x = keyboard.nextDouble();

        while(x < 0) {
            System.out.println("I won't take the square root of a negative.");
            System.out.print("\nNew number: ");
            x = keyboard.nextDouble();
        }

        y = Math.sqrt(x);

        System.out.println("The square root of "+x+" is "+y);
    }
}
