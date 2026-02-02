package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {

        String sentence = "My name is faize jafri";

        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
