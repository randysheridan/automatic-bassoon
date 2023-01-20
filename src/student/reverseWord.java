package student;

import java.util.Scanner;

public class reverseWord {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a word: ");

        String userWord = userInput.nextLine();
        char[] userWordArray = new char[userWord.length()];

        for (int i = 0; i < userWordArray.length; i++) {
            userWordArray[i] = userWord.charAt(i);
        }

        for (int i = (userWordArray.length - 1); i >= 0; i--) {
            System.out.print(userWordArray[i]);
        }
        System.out.println(" ");
    }
}
