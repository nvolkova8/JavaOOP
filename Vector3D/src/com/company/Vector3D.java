package com.company;

public class Vector3D {
    public Point3D startPoint;
    public Point3D endPoint;
    public Vector3D(Point3D a, Point3D b) { // конструктор
        startPoint = a;
        endPoint = b;
    }

    @Override
    public boolean equals(Object o) {
        // 1
        if (this == o) {
            return true;
        }

        // 2
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        // 3
        Vector3D v = (Vector3D) o;
        return this.startPoint.x == v.startPoint.x &&
                this.startPoint.y == v.startPoint.y &&
                this.startPoint.z == v.startPoint.z &&
                this.endPoint.x == v.endPoint.x &&
                this.endPoint.y == v.endPoint.y &&
                this.endPoint.z == v.endPoint.z;
    }

    public void print(){
        System.out.println("Начало вектора: " + startPoint.x + ", " + startPoint.y + ", " + startPoint.z);
        System.out.println("Конец вектора: " + endPoint.x + ", " + endPoint.y + ", " + endPoint.z);
        return;
    }


    public double getX(){
        return endPoint.x - startPoint.x;
    }

    public double getY(){
        return endPoint.y - startPoint.y;
    }

    public double getZ(){
        return endPoint.z - startPoint.z;
    }

    public double scalar(Vector3D v){
        return this.getX() * v.getX() + this.getY() * v.getY() + this.getZ() * v.getZ();
    }

    public double len(){
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.getZ() * this.getZ());
    }

   public Vector3D multiply(double factor){
       return new Vector3D(
               new Point3D(startPoint.x * factor, startPoint.y * factor, startPoint.z * factor),
               new Point3D(endPoint.x * factor, endPoint.y * factor, endPoint.z * factor)
       );
   }

    public Vector3D add(Vector3D v){
        return new Vector3D(
                new Point3D(startPoint.x + v.startPoint.x, startPoint.y + v.startPoint.y, startPoint.z + v.startPoint.z),
                new Point3D(endPoint.x + v.endPoint.x, endPoint.y + v.endPoint.y, endPoint.z + v.endPoint.z)
        );
    }

    public Vector3D sub(Vector3D v){
        return new Vector3D(
                new Point3D(startPoint.x - v.startPoint.x, startPoint.y - v.startPoint.y, startPoint.z - v.startPoint.z),
                new Point3D(endPoint.x - v.endPoint.x, endPoint.y - v.endPoint.y, endPoint.z - v.endPoint.z)
        );
    }

    public Vector3D vecX(Vector3D v){
        return new Vector3D(
                new Point3D(this.getZ() * v.getY(),this.getX() * v.getZ(),this.getY()*v.getX()),
                new Point3D(this.getY()*v.getZ(), this.getZ()*v.getX(), this.getX()*v.getY())
        );
    }

    public boolean pcollin(Vector3D v){
        Vector3D vec = this.vecX(v);
        if (vec.getX() == 0 && vec.getY() == 0 && vec.getZ() == 0){
            return true;
        }
        return false;
    }
}
