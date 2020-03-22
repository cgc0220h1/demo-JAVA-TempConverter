import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = 0;
        double result = 0;
        boolean isExit = false;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Convert Fahrenheit temp");
            System.out.println("2. Convert Celsius temp");
            System.out.println("0. Exit");
            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();
            if (choice == 0) {
                isExit = true;
                System.out.println("Exit Program!");
                System.exit(0);
            }

            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit temp: ");
                    temp = scanner.nextDouble();
                    result = fahrenheitToCelsius(temp);
                    System.out.printf("%.3f Fahrenheit is equal %.3f Celsius \n", temp, result);
                    break;
                case 2:
                    System.out.print("Enter Celsius temp: ");
                    temp = scanner.nextDouble();
                    result = celsiusToFahrenheit(temp);
                    System.out.printf("%.3f Celsius is equal %.3f in Fahrenheit \n", temp, result);
                    break;
                default:
                    System.out.println("Invalid input! Please choose again!");
            }
            System.out.println();
        } while (!isExit);
    }

    public static double celsiusToFahrenheit(double temp) {
        double fahrenheit = (9.0 / 5) * temp + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double temp) {
        double celsius = (5.0 / 9) * (temp - 32);
        return celsius;
    }
}
