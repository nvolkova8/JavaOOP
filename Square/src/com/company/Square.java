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
    // периметр
    public double perimeterSquare() {
        double p = 4 * dl_s;
        return p;
    }
    // перемещает центр в случайную точку проскости
    public void moveRandomSquare() {
        x = (int) (Math.random() * 199) - 99;
        y = (int) (Math.random() * 199) - 99;
    }
    // расстояние между центрами двух квадратов
    public double distanceСentersSquares(Square squ2) {
        double a = this.x - squ2.x;
        double b = this.y - squ2.y;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }
}

