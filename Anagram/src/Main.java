import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //take user input and turn to lowercase
        System.out.println("Enter two words (separated by a space): ");
        String words = scan.nextLine().toLowerCase();

        anagramChecker(words);

    }

    static boolean anagramChecker(String words) {

        //convert input to array
        String[] wordList = words.split(" ");

        //separate strings in array to an array of chars, then sort them
        char[] word1 = wordList[0].toCharArray();
        Arrays.sort(word1);
        char[] word2 = wordList[1].toCharArray();
        Arrays.sort(word2);

        //System.out.println(Arrays.toString(word1));
        //System.out.println(Arrays.toString(word2));

        //compares to two array of chars
        if (Arrays.equals(word1, word2)) {

            System.out.println("Anagrams!");
            return true;
        }
        else {

            System.out.println("Not anagrams");
            return false;
        }

    }
}