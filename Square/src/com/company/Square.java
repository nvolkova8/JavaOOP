package com.company;

// описываем отдельный новый класс
class Square {
    // свойства класса
    public double x; // абсцисса центра
    public double y; // ордината центра
    public double dl_s; // сторона
    // методы класса
// выводит на экран параметры квадрата
    public void printSquare() {
        System.out.println("Квадрат с центром ("+x+";"+y+") и стороной "+dl_s);
    }
    // перемещает центр
    public void moveSquare(double a, double b) {
        x = x + a;
        y = y + b;
    }
    // масштабируем, выполняем преобразование подобия с коэффициентом k
    public void zoomSquare(double k) {
        dl_s = dl_s * k;
    }
}

