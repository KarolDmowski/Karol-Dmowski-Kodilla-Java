package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numberArray = new int[20];
        for(int i =0; i < numberArray.length; i++){
            numberArray[i] = i*2;
        }
        //When
        double average = ArrayOperations.getAvarege(numberArray);
        System.out.println(average);
        //The
        Assert.assertEquals(19,average,0);

    }
}
