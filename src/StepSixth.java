import java.util.Scanner;

public class StepSixth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Task1 (delete all spaces and bring it to uppercase, after print result word by letters in column )
        System.out.print("Please enter any sentence: ");
        String sentence = scan.nextLine();

        String newSentence = sentence.replace(" ", "");
        newSentence = sentence.toUpperCase();

        for (int i = 0; i < newSentence.length(); i++) {
            System.out.println(newSentence.charAt(i));
        }
        ;

        //Task2
        System.out.print("Please enter any sentence: ");
        String sentence2 = scan.nextLine();

        if (sentence2.contains("java")) {
            String reversedSentence = new StringBuilder(sentence2).reverse().toString();
            System.out.println("Reversed sentence is: " + reversedSentence);
        } else {
            String[] byWords = sentence2.split("\\s");
            for (int i = 0; i < byWords.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(byWords[i].toUpperCase() + " ");
                } else {
                    System.out.print(byWords[i] + " ");
                }
            }
        }
        ;

        //Task3 (counting letters in a sentence)
        System.out.print("Please enter any sentence: ");
        String sentence3 = scan.nextLine();

        System.out.print("Enter a letter to count: ");
        char letter = scan.next().charAt(0);

        int sum = 0;

        for (int i = 0; i < sentence3.length(); i++) {
            if (sentence3.charAt(i) == letter) {
                sum++;
            }
        };
        System.out.println("Number of " + letter + "'s in the sentence: " + sum);


    }
}

