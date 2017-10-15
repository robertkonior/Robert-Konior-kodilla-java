package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(ArrayList<Integer> numbers){
        List<Integer> evennumbers = new ArrayList<>();
        for (int n:numbers) {
            if(numbers.get(n)%2 == 0){
                 evennumbers.add(numbers.get(n));
            }

        }
        return evennumbers;
    }
}
