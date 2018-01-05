package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
public class StreamMain {
    public static void main(String[] args) {
        /*Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Executor codeToExecute = () -> System.out.print("This is an example#2");
        processor.execute(codeToExecute);

        processor.execute(() -> System.out.print("This is an example#3\n"));

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
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*//*

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("text1", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("text2", text -> text.toUpperCase());
        poemBeautifier.beautify("text3", text -> text.replaceFirst("3", "#3"));
        poemBeautifier.beautify("text4", text -> text.replaceAll("t", "T"));*/

        /*People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("#Elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

       /* BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        Forum forum = new Forum();
        String theResultStringOfForumUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getForumUserGender() == 'M')
                .filter(forumUser -> forumUser.getForumUserBirthDate().isBefore(LocalDate.of(1998,1,5)))
                .filter(forumUser -> forumUser.getGetForumUserPosts() >= 1)
                .map(ForumUser::toString)
                .collect(Collectors.joining(",\n", "List of users printed with Collectors.joining():\n", "\nWhat a list!" ));

        System.out.println(theResultStringOfForumUser + "\n");

        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getForumUserGender() == 'M')
                .filter(forumUser -> forumUser.getForumUserBirthDate().isBefore(LocalDate.of(1998,1,5)))
                .filter(forumUser -> forumUser.getGetForumUserPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getForumUserID, forumUser -> forumUser));

        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getValue())
                .forEach(System.out::println);
    }
}
