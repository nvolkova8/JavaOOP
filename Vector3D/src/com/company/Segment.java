package com.company;

public class Segment {
    public Point3D firstPoint;
    public Point3D secondPoint;
    public Segment(Point3D a, Point3D b) { // конструктор
        firstPoint = a;
        secondPoint = b;
    }

    public double len(){
        return Math.sqrt((firstPoint.x - secondPoint.x) * (firstPoint.x - secondPoint.x) +
                (firstPoint.y - secondPoint.y) * (firstPoint.y - secondPoint.y) +
                (firstPoint.z - secondPoint.z) * (firstPoint.z - secondPoint.z));
    }

    public double distanceTo(Point3D point){
        Vector3D ba = new Vector3D(secondPoint, firstPoint);
        Vector3D cb = new Vector3D(point, secondPoint);
        Vector3D ba_cb = ba.vecX(cb);

        return ((Math.sqrt(ba_cb.getX() * ba_cb.getX() + ba_cb.getY() * ba_cb.getY() + ba_cb.getZ() * ba_cb.getZ())) /
                (Math.sqrt(ba.getX() * ba.getX() + ba.getY() * ba.getY() + ba.getZ() * ba.getZ())));
    }
}
