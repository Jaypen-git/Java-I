import java.util.Scanner;

public class Calculator {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String errorMessage = "Invalid input entered. Terminating...";
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");
        String operation = input.next();
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Enter two integers:");
                if (input.hasNextInt()) {
                    int x = input.nextInt();
                    if (input.hasNextInt()) {
                        int y = input.nextInt();
                        System.out.println("Answer: " + (x + y));
                    } else {
                        System.out.println(errorMessage);
                    }
                } else {
                    System.out.println(errorMessage);
                }
                break;
            case "subtract":
                System.out.println("Enter two integers:");
                if (input.hasNextInt()) {
                    int x = input.nextInt();
                    if (input.hasNextInt()) {
                        int y = input.nextInt();
                        System.out.println("Answer: " + (x - y));
                    } else {
                        System.out.println(errorMessage);
                    }
                } else {
                    System.out.println(errorMessage);
                }
                break;
            case "multiply":
                System.out.println("Enter two doubles:");
                if (input.hasNextDouble()) {
                    double x = input.nextDouble();
                    if (input.hasNextDouble()) {
                        double y = input.nextDouble();
                        System.out.printf("Answer:%.2f\n", x * y);
                    } else {
                        System.out.println(errorMessage);
                    }
                } else {
                    System.out.println(errorMessage);
                }
                break;
            case "divide":
                System.out.println("Enter two doubles:");
                if (input.hasNextDouble()) {
                    double x = input.nextDouble();
                    if (input.hasNextDouble()) {
                        double y = input.nextDouble();
                        System.out.printf("Answer:%.2f\n", x / y);
                    } else {
                        System.out.println(errorMessage);
                    }
                } else {
                    System.out.println(errorMessage);
                }
                break;
            case "alphabetize":
                System.out.println("Enter two words: ");
                if (input.hasNext()) {
                    String x = input.next();
                    if (input.hasNext()) {
                        String y = input.next();
                        int result = x.compareToIgnoreCase(y);
                        if (result == 0) {
                            System.out.println("Answer: Chicken or Egg.");
                        } else if (result < 0) {
                            System.out.println("Answer: " + x + " comes before " + y + " alphabetically.");
                        } else if (result > 0) {
                            System.out.println("Answer: " + y + " comes before " + x + " alphabetically.");
                        } else {
                            System.out.println(errorMessage);
                        }
                    } else {
                        System.out.println(errorMessage);
                    }
                } else {
                    System.out.println(errorMessage);
                }
                break;
            default:
                System.out.println(errorMessage);
                break;
        }
    }
}