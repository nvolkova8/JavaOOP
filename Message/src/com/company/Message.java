package com.company;


import java.util.Locale;

public class Message {
    public String stroka;
    public Message(String str) { // конструктор
        stroka = str;
    }

    public int countWords() {
        String[] array = stroka.split(" ");
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (!array[i].isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public String reverse() {
        String str = "";
        for (int i = stroka.length() - 1; i >= 0; i--){
            str += stroka.substring(i, i + 1);
        }
        return str;
    }

    public int count(char c) {
        int cnt = 0;
        int index = stroka.indexOf(c);
        while (index != -1){
            cnt++;
            index = stroka.indexOf(c, index + 1);
        }
        return cnt;
    }

    public String seria() {

        String[] array = stroka.split(" ");
        for (int i = 0; i < array.length; i++){
            if (!array[i].isEmpty()) {
                if (array[i].toLowerCase().equals("серия") && i < array.length - 1){
                    return array[i+1];
                }
            }
        }
        return "";
    }

    public String nomer() {
        String[] array = stroka.split(" ");
        for (int i = 0; i < array.length; i++){
            if (!array[i].isEmpty()) {
                if (array[i].equals("№") && i < array.length - 1){
                    return array[i+1];
                }
                if (array[i].charAt(0) == '№'){
                    return array[i].substring(1,array[i].length());
                }
            }
        }
        return "";
    }
}
