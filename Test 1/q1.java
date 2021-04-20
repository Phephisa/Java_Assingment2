package JavaPrep;

import java.util.ArrayList;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        // question1();
        question2();

    }

    public static void question1() {
        // a
        ArrayList<String> array = new ArrayList<String>();
        // b
        array.add("word");
        array.add("cant");
        array.add("write");
        array.add("book");

        System.out.println(array);

        System.out.println(array.get(0));

        // c
        System.out.println(array.size());
        // d
        array.remove(1);
        System.out.println(array);
        // e
        // Arraylist no size limit
        // Arraylist.add(i) vs array[index]=value
        //
    }

    public static void question2() {
        // a
        double[] arr = { 2, 4, 5.5, 6.8, 15, 22 };
        // or
        double[] arr1 = new arr1[8];

        // b and c
        double sum = 0;
        double count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;

        }

        double avg = sum / count;

        // d

        Array.sort(arr); // sorting array
        System.out.println(arr[7]);

        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[0];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
