package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import com.kodilla.stream.iterate.*;

public class StreamMain {
    public static void main(String[] args) {
        /*Processor processor = new Processor();
        * ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        * processor.execute(executeSaySomething);
        *
        * Executor codeToExecute = () -> System.out.print("This is an example#2");
        * processor.execute(codeToExecute);
        *
        * processor.execute(() -> System.out.print("This is an example#3\n"));
        */
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a,b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("text1", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("text2", text -> text.toUpperCase());
        poemBeautifier.beautify("text3", text -> text.replaceFirst("3", "#3"));
        poemBeautifier.beautify("text4", text -> text.replaceAll("t", "T"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
