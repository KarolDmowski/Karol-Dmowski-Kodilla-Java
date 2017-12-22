package com.kodilla.testing.collection;

import java.io.*;
import java.lang.*;
import java.util.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Iterator<Integer>  iteratorList = numbers.iterator();
        while(iteratorList.hasNext()){
            Integer number = iteratorList.next();
            if(number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
