package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {
    private ArrayList<Integer> even;


    public OddNumbersExterminator() {
        even = new ArrayList<Integer>();
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> number) {

        ArrayList<Integer> even = new ArrayList<Integer>();
        int counter = number.size();


            for (int n = 0; n < counter; n++) {
                int numberValue = number.get(n);
                if (numberValue % 2 == 0) {
                    even.add(numberValue);

                }
            }
        for (Integer numberNewList : even) {
                System.out.println(numberNewList);
                }


        return even;

    }
    }


