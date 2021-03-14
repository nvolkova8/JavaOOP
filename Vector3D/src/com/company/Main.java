package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point3D a1 = new Point3D(1,1,1);
        Point3D b1 = new Point3D(2,3,4);
        Vector3D vec1 = new Vector3D(a1, b1);
        //System.out.println(vec1.getX());
        //System.out.println(vec1.getY());
        //System.out.println(vec1.getZ());
        Point3D a2 = new Point3D(1,1,1);
        Point3D b2 = new Point3D(2,3,4);
        Vector3D vec2 = new Vector3D(a2, b2);
        //System.out.println(vec1.scalar(vec2));
        //System.out.println(vec1.len());
        //System.out.println(vec2.len());
        //System.out.println(vec1.multiply(2).getZ());

        //vec1.print();
        //vec1 = vec1.multiply(2);
        //vec1.print();

        vec1.print();
        vec2.print();
        //vec1 = vec1.vecX(vec2);
        //vec1.print();
        //System.out.println(vec1.pcollin(vec2));
        System.out.println(vec1.equals(vec2));
    }
}
