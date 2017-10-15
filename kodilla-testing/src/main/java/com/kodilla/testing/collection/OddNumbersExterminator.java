package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evennumbers = new ArrayList<>();
        for (Integer n : numbers) {
            if(n % 2 == 0){
                 evennumbers.add(n);
            }

        }
        return evennumbers;
    }
}
