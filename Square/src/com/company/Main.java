package com.company;

// описываем основной класс, содержащий метод main
public class Main {
    public static void main(String[] args) {
        // Создаём объект (квадрат класса Square), у него будет нулевая
        // сторона и центр в (0.0;0.0), поскольку все свойства получат
        // значения по умолчанию
        Square s1 = new Square();
        // выводим на экран параметры квадрата
        s1.printSquare();
        // Меняем абсциссу центра, обращаясь к свойству x
        s1.x = 3;
        // Меняем сторону, обращааясь к свойству dl_s
        s1.dl_s = 12.3;
        // выводим на экран обновлённые параметры окружности
        s1.printSquare();

        // Создаём другой объект того же класса
        Square s2 = new Square();
        s2.dl_s = 3.14;
        s2.zoomSquare(1.66);
        s2.printSquare(); // Квадрат с центром (0.0;0.0) и стороной 5.2124

        //  Тестирую периметр
        Square s3 = new Square();
        s3.dl_s = 5.1;
        System.out.println("Периметр квадрата s3: " + s3.perimeterSquare());

        // Тестирую перемещение центра квадрата в случайную точку плоскости
        Square s4 = new Square();
        s4.x = 10.1;
        s4.y = 8.2;
        System.out.println("Начальное положение квадрата s4: ");
        s4.printSquare();
        s4.moveRandomSquare();
        System.out.println("Конечное положение квадрата s4: ");
        s4.printSquare();

        //Тестирую расстояние между центрами двух квадратов
        System.out.println("Тестирую расстояние между центрами двух квадратов s5 и s6: ");
        Square s5 = new Square();
        s5.x = 5;
        s5.y = 4;
        s5.printSquare();
        Square s6 = new Square();
        s6.x = 1;
        s6.y = 1;
        s6.printSquare();
        System.out.println("Расстояние между квадратами s5 и s6: " +
                s5.distanceСentersSquares(s6));
    }
}