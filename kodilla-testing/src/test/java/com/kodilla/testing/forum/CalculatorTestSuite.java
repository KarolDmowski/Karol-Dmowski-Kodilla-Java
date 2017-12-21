package com.kodilla.testing.forum;

import com.kodilla.testing.calculator.Calculator;
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTestSuite {
    @Test
    public void testCaseCalculatorAdd(){
        //Given == Arrange
        int number = 30;
        //When == Act
        int addResult = Calculator.addCalc(10,20);
        //Then == Assert
        Assert.assertEquals(number,addResult);
    }

    @Test
    public void  testCaseLalculatorSubstract(){
        //Given == Arrange
        int number = 20;
        //When == Act
        int substractResult = Calculator.substractCalc(25,5);
        //Then == Assert
        Assert.assertEquals(number,substractResult);
    }

}
