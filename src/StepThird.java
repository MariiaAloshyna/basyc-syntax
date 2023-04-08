import java.util.Scanner;
public class StepThird {
    public static void main(String[] args) {

        //Task1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer value: ");
        int intValue = scan.nextInt();

        if (intValue == 0) {
            System.out.println("First message");
        } else if (intValue < 10) {
            System.out.println("Second message");
        } else {
            System.out.println("Third message");
        }

        //Task2
        System.out.print("Enter any double value: ");
        double doubleValue = scan.nextDouble();

        if (doubleValue % 2 == 0) {
            System.out.println("The double value is even.");
        } else {
            System.out.println("The double value is odd.");
        }

        //Task3
        System.out.println("Enter any float value: ");
        float floatValue = scan.nextFloat();

        if ( (floatValue == 15) || (floatValue > 10 && floatValue % 2 == 0)) {
            System.out.println("Conditions were met");
        }    else {
                System.out.println("Conditions were nor met");
        }

    }
}