package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        if (Calculator.addCalc(7,3) == 10) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add test Error");
        }

        if (Calculator.substractCalc(-15,-35) == 20){
            System.out.println("Substract test OK");
        } else {
            System.out.println("Substract test Error");
        }
    }
}
