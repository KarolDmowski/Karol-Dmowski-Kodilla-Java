package com.kodilla.stream;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        /*ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        * processor.execute(executeSaySomething);
        * */

        /*Executor codeToExecute = () -> System.out.print("This is an example#2");
        * processor.execute(codeToExecute);
        * */
        processor.execute(() -> System.out.print("This is an example#3\n"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpresion(10,5, (a,b) -> a + b);
        expressionExecutor.executeExpresion(10,5, (a,b) -> a - b);
        expressionExecutor.executeExpresion(10,5, (a,b) -> a * b);
        expressionExecutor.executeExpresion(10,5, (a,b) -> a / b);
    }
}
