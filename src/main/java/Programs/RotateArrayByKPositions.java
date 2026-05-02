package Programs;

import java.util.Arrays;

public class RotateArrayByKPositions {


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        int k = 3;

        int n = arr.length; //6

        for (int i = 0; i < k; i++) {

            int last = arr[n - 1];  //6

            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];   //sab elements ko ek aage shift kr rhe hai..
            }
            arr[0] = last; //last saved element ko first position par
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }

}
