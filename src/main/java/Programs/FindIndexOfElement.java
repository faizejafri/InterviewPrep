package Programs;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FindIndexOfElement {


    public static void main(String[] args) {
        int arr[] = {1, 6, 3, 4, 5, 6, 6, 7, 8, 9, 9};
        int searchElement = 9;
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                indexes.add(i + 1);
            }
        }
        if (indexes.size() != 0) {
            System.out.print(indexes);
        } else
            System.out.println("No element found !");
    }


}
