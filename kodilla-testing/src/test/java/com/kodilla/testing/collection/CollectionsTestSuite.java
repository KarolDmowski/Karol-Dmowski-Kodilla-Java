package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

public class CollectionsTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suit: end");
    }
    @Test
    public void testCaseEmptyArrayList(){
        //Given == Arrange
        ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();
        //When == Act
        ArrayList<Integer> arrayList = new OddNumbersExterminator().exterminate(emptyArrayList);
        System.out.println("Testing exterminate on empty ArrayList");
        //Then == Assert
        Assert.assertEquals(arrayList ,emptyArrayList);
    }
    @Test
    public void testCaseArrayList(){
        //Given == Arrange
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        //When ==Act
        ArrayList<Integer> evenArrayList = new OddNumbersExterminator().exterminate(arrayList);
        boolean isEvenFlag = true;
        for(int number : evenArrayList){
            if(number%2 != 0){
                isEvenFlag = false;
            }
        }
        System.out.println("Testing exterminate");
        //Then == Assert
        Assert.assertEquals(true,isEvenFlag);
    }
}
