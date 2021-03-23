package com.company;

import java.util.Scanner;

public class SegmentTest {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double x, y, z;

        System.out.println("Координаты первой точки отрезка: ");
        System.out.println("X: ");
        x = sc.nextDouble();
        sc.nextLine();
        System.out.println("Y: ");
        y = sc.nextDouble();
        sc.nextLine();
        System.out.println("Z: ");
        z = sc.nextDouble();
        sc.nextLine();
        Vector3D a = new Vector3D(x,y,z);

        System.out.println("Координаты второй точки отрезка: ");
        System.out.println("X: ");
        x = sc.nextDouble();
        sc.nextLine();
        System.out.println("Y: ");
        y = sc.nextDouble();
        sc.nextLine();
        System.out.println("Z: ");
        z = sc.nextDouble();
        sc.nextLine();
        Vector3D b = new Vector3D(x,y,z);

        Segment seg = new Segment(a, b);
        System.out.println("Длина отрезка: " + seg.len());

        System.out.println("Координаты точки: ");
        System.out.println("X: ");
        x = sc.nextDouble();
        sc.nextLine();
        System.out.println("Y: ");
        y = sc.nextDouble();
        sc.nextLine();
        System.out.println("Z: ");
        z = sc.nextDouble();
        sc.nextLine();
        Vector3D point = new Vector3D(x,y,z);

        System.out.println("Расстояние от точки до отрезка: " + seg.distanceTo(point));
    }
}