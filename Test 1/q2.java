 himport java.util.*;

public class q2 {
    public static void main(String[] args) {
        // a
        double[] arr = { 2, 4, 5.5, 6.8, 15, 22 };
        // or
        // double[] arr1 = new arr1[8];

        // b and c
        double sum = 0;
        double count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;

        }

        double avg = sum / count;
        System.out.println(avg);

        // d

        Array.sort(arr); // sorting array
        System.out.println(arr[7]);

        /*
         * double max = 0; for (int i = 0; i < arr.length; i++) { max = arr[0]; if
         * (arr[i] > max) { max = arr[i]; } } System.out.println(max);
         */
    }
}
