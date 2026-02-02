package Programs;

import java.util.Arrays;
import java.util.Collections;

public class ReverseEachWordInSentence {

    public static void main(String[] args) {
        String sentence = "My name is faize jafri";

        String[] words = sentence.split(" ");

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.print(reversedWord + " ");
        }
    }
}
