package Programs;

public class ReverseEachWordWithoutInbuiltFuntion {

    static String reverseEachWord(String sentence) {
        String result = "";

        for (String word : sentence.split(" ")) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result += word.charAt(i);
            }
            result = result + " ";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("My name is faize jafri"));
    }
}
