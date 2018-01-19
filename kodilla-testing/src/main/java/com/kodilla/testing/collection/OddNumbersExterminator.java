package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {
    ArrayList<Integer> even;


    public OddNumbersExterminator() {
        even = new ArrayList<Integer>();
    }

    public void exterminate(ArrayList<Integer> number) {

        ArrayList<Integer> even = new ArrayList<Integer>();
        int counter = number.size();
        if (counter == 0) {
            System.out.println("List empty" + counter);
        } else {

            for (int n = 0; n < counter; n++) {
                int numberValue = number.get(n);
                if (numberValue % 2 == 0) {
                    even.add(numberValue);

                }
            }
        }

        for (Integer numberNewList : even) {
            System.out.println(numberNewList);
        }
    }
}

