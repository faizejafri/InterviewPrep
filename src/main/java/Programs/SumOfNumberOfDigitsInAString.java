package Programs;

public class SumOfNumberOfDigitsInAString {

    public static void main(String[] args) {

        String str = "san10ok23";
        //Output = 10+23 = 33

        int sum = 0;
        String digit = "";

        for (int i = 0; i < str.length(); i++) {

            Character ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digit = digit + ch;
            } else {
                if (digit.length() > 0) {
                    sum = sum + Integer.parseInt(digit);
                    digit = "";
                }
            }
        }

        if (digit.length() > 0) {
            sum = sum + Integer.parseInt(digit);
        }
        System.out.println(sum);


    }
}
