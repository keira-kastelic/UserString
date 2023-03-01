/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
import java.util.Scanner;
public class UserString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // creating a scanner
        Scanner s2 = new Scanner(System.in); // creating a second scanner (bc of technical issues)
        System.out.println("Enter a phrase");// prompting the user
        String phrase = s.nextLine(); // reads the users phrase
        int phraseLength = phrase.length(); // storing the phrase into a variable
        System.out.println("The index is"); // prompting the user
        System.out.println(phraseLength); // printing out the phrase length
        System.out.println("Enter a number between 0 and "+ (phraseLength-1)); // prompting the user to pick a number between o and the last index
        int number = s.nextInt();// reading their number
        char characterIndex = phrase.charAt(number); // finding the character of the number entered
        System.out.println("The character of the index " + number + " is"); // printing out the answer to question
        System.out.println(characterIndex); // printing out the character at the index
        System.out.println("Enter another String to see if/where it exists in your original phrase"); // prompting the user
        String typedIndex = s2.nextLine(); // reading the users typed string
        int typedNumIndex = phrase.indexOf(typedIndex); // finding the character of the num
        System.out.println("Is it in the string?"); // printing out the answer
        boolean isString = (typedNumIndex >= 0); // creating a boolean for if the character(s) is in the string
        System.out.println(isString); // printing out the boolean
        int stringIndex = phrase.indexOf(typedIndex); // finding the index of the word
        System.out.println("The string is at"); // printing the answer
        System.out.println(stringIndex); // printing the index
    }
}
