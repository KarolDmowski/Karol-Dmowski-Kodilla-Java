package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAvarege(int[] numbers){
        //List<Integer> listOfIntegers = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        return IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
    }
}
