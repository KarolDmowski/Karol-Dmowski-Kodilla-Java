package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionsTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testCaseEmptyArrayList() {
        //Given == Arrange
        ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();
        //When == Act
        ArrayList<Integer> arrayList = new OddNumbersExterminator().exterminate(emptyArrayList);
        System.out.println("Testing exterminate on empty ArrayList");
        //Then == Assert
        Assert.assertEquals(arrayList, emptyArrayList);
    }

    @Test
    public void testCaseArrayList() {
        //Given == Arrange
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(4);
        //When ==Act
        ArrayList<Integer> resultArrayList = new OddNumbersExterminator().exterminate(arrayList);
        System.out.println("Testing exterminate");
        //Then == Assert
        Assert.assertEquals(resultArrayList, arrayList);
    }
}
