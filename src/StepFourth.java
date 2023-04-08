import java.util.Scanner;
public class StepFourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Task1
        System.out.print("Enter any value: ");
        int value = scan.nextInt();
        if (value < 0) {
            System.out.println("Here is some error");
        } else {
            for (int i = 0; i <= value; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " - The number is even.");
                } else if (i % 3 == 0) {
                    System.out.println("The number is multiple to 3.");
                } else {
                    System.out.println(i);
                }
            }
        }

        //Task2
        System.out.print("Enter any value: ");
        int value2 = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= value2; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + value2 + " is " + factorial);


        //Task3
        System.out.print("Enter any value: ");
        int value3 = scan.nextInt();

        int largestDivisor = 1;
        for (int i = value3 - 1; i >= 1; i--) {
            if (value3 % i == 0) {
                largestDivisor = i; break;
            }
        }
        System.out.println("The largest integer divisor for a given number (" + value3 + ") is " + largestDivisor);

        //Task4
        int ageValue;

        do {
            System.out.print("Enter the age: ");
            ageValue = scan.nextInt();

            if (ageValue <= 0 || ageValue > 140) {
                System.out.println("Error: Invalid age value (Note: valid age value is between 1 and 140)");
            }
        } while (ageValue <= 0 || ageValue > 140);

        System.out.println("Success! Entered age value is valid.");
    }
}
