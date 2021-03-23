package com.company;

public class Vector3D {
    public double x;
    public double y;
    public double z;

    public Vector3D(double x1, double y1, double z1) {
        x = x1;
        y = y1;
        z = z1;
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
            return this.x == v.x && this.y == v.y && this.z == v.z;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getZ(){
        return z;
    }

    public double scalar(Vector3D v){
        return this.getX() * v.getX() + this.getY() * v.getY() + this.getZ() * v.getZ();
    }

    public double len(){
        return Math.sqrt(this.getX() * this.getX() +
                this.getY() * this.getY() +
                this.getZ() * this.getZ());
    }

   public Vector3D multiply(double factor){
       return new Vector3D(this.getX() * factor, this.getY() * factor, this.getZ() * factor);

   }

    public Vector3D add(Vector3D v){
        return new Vector3D(this.getX() + v.getX(), this.getY() + v.getY(), this.getZ() + v.getZ());
    }

    public Vector3D sub(Vector3D v){
        return new Vector3D(this.getX() - v.getX(), this.getY() - v.getY(), this.getZ() - v.getZ());
    }

    public Vector3D vecX(Vector3D v){
        return new Vector3D(this.getY() * v.getZ() - this.getZ() * v.getY(),
                this.getZ() * v.getX() - this.getX() * v.getZ(),
                this.getX() * v.getY() - this.getY() * v.getX());
    }

    public boolean pcollin(Vector3D v){
        Vector3D vec = this.vecX(v);
        if (vec.getX() == 0 && vec.getY() == 0 && vec.getZ() == 0){
            return true;
        }
        return false;
    }
}
