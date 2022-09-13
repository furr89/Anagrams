import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words (separated by a space): ");
        String words = scan.nextLine();

        anagramChecker(words);

    }

    static boolean anagramChecker(String words) {

        String[] wordList = words.split(" ");

        char[] word1 = wordList[0].toCharArray();
        Arrays.sort(word1);
        char[] word2 = wordList[1].toCharArray();
        Arrays.sort(word2);

        //System.out.println(Arrays.toString(word1));
        //System.out.println(Arrays.toString(word2));

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