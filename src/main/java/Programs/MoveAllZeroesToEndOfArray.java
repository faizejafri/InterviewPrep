package Programs;

import java.util.Arrays;

public class MoveAllZeroesToEndOfArray {

    public static void main(String[] args) {
        int arr[] = {0, 2, 9, 8, 0, 1, 7,};

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
