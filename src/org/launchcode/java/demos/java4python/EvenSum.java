package org.launchcode.java.demos.java4python;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 12/10/18.
 */
public class EvenSum {
    private static Integer sumsitup(ArrayList arraylist) {
        Integer sum = 0;
        for (int i=0; i < arraylist.size() + 1; i++) {
            if (i%2 == 0) {sum += i;}
        }
        System.out.println("The sum of even numbers is " + sum);

        return sum;
    }

    public static void fiveWords(ArrayList arraylist) {
        Integer wordlength = 0;
        for (int i=0; i < arraylist.size(); i++) {
            wordlength = arraylist.get(i).toString().length();
            if (wordlength == 5) {System.out.println(arraylist.get(i));}
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> tens = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for (Integer ten : tens ){System.out.println(ten);}
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("goodbye");
        words.add("dad");
        words.add("mom");
        words.add("yo");

        sumsitup(tens);
        fiveWords(words);
        return;
    }
}
