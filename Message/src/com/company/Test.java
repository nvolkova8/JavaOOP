package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку");
        Message msg = new Message(sc.nextLine());

        System.out.println("Тестируем количество слов");
        System.out.println("Ожидаемое количество слов:");
        int resultInt = msg.countWords();
        int expectInt = sc.nextInt();
        if (resultInt == expectInt) {
            System.out.println("Тест успешен!");
        }
        else {
            System.out.println("Тест провален!");
        }
        System.out.println("Факстический результат: " +
                resultInt + " Ожидаемый результат: " + expectInt);

        System.out.println("Тестируем перевернутую строку");
        System.out.println("Ожидаемая перевертнутая строка:");
        String resultString = msg.reverse();
        sc.nextLine();
        String expectString = sc.nextLine();
        if (resultString.equals(expectString)) {
            System.out.println("Тест успешен!");
        }
        else{
            System.out.println("Тест провален!");
        }
        System.out.println("Факстический результат: " +
                resultString + " Ожидаемый результат: " + expectString);

        System.out.println("Тестируем вхождение символа в строку");
        System.out.println("Символ:");
        char c = sc.next().charAt(0);
        System.out.println("Ожидаемое количество вхождений:");
        resultInt = msg.count(c);
        expectInt = sc.nextInt();
        if (resultInt == expectInt) {
            System.out.println("Тест успешен!");
        }
        else{
            System.out.println("Тест провален!");
        }
        System.out.println("Факстический результат: " +
                resultInt + " Ожидаемый результат: " + expectInt);

        System.out.println("Тестируем серию");
        System.out.println("Ожидаемая серия:");
        resultString = msg.seria();
        sc.nextLine();
        expectString = sc.nextLine();
        if (resultString.equals(expectString)) {
            System.out.println("Тест успешен!");
        }
        else{
            System.out.println("Тест провален!");
        }
        System.out.println("Факстический результат: " +
                resultString + " Ожидаемый результат: " + expectString);

        System.out.println("Тестируем номер");
        System.out.println("Ожидаемый номер:");
        resultString = msg.nomer();
        expectString = sc.nextLine();
        if (resultString.equals(expectString)) {
            System.out.println("Тест успешен!");
        }
        else{
            System.out.println("Тест провален!");
        }
        System.out.println("Факстический результат: " +
                resultString + " Ожидаемый результат: " + expectString);
    }
}
