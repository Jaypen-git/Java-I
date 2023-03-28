import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main (String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a fahrenheit value and a day of the week: ");
            int fahrenheit = input.nextInt();
            String day = input.next();
            double celcius = (5.0/9) * (fahrenheit - 32);
            System.out.printf("%s Celcius: %.1f\n", day, celcius);
        }
    }
}