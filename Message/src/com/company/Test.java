package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку");
        Message msg = new Message(sc.nextLine());

        int resultInt = msg.countWords();
        System.out.println("Количество слов: " + resultInt);

        String resultString = msg.reverse();
        System.out.println("Перевертнутая строка: " + resultString);

        char c = sc.next().charAt(0);
        resultInt = msg.count(c);
        System.out.println("Количество вхождений: " + resultInt);

        resultString = msg.seria();
        System.out.println("Серия: " + resultString);


        resultString = msg.nomer();
        System.out.println("Номер: " + resultString );
    }
}
