package com.company;

import static org.junit.Assert.*;

public class Vector3DTest {

    @org.junit.Test
    public void testEquals() {
        boolean res = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).equals(
                new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)));
        assertEquals(true, res);
        boolean res2 = new Vector3D(new Point3D(2,1,1), new Point3D(2,3,4)).equals(
                new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)));
        assertEquals(false, res2);

    }

    @org.junit.Test
    public void getX() {
        double res = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).getX();
        assertTrue(res == 1);
        double res1 = new Vector3D(new Point3D(5,1,1), new Point3D(2,3,4)).getX();
        assertTrue(res1 == -3);
    }

    @org.junit.Test
    public void getY() {
        double res = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).getY();
        assertTrue(res == 2);
        double res1 = new Vector3D(new Point3D(5,1,1), new Point3D(2,7,4)).getY();
        assertTrue(res1 == 6);
    }

    @org.junit.Test
    public void getZ() {
        double res = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).getZ();
        assertTrue(res == 3);
        double res1 = new Vector3D(new Point3D(5,1,1), new Point3D(2,7,1)).getZ();
        assertTrue(res1 == 0);
    }

    @org.junit.Test
    public void scalar() {
        double res = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).scalar(
                new Vector3D(new Point3D(1,1,1), new Point3D(5,6,7)));
        assertTrue(res == 32);
        double res1 = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).scalar(
                new Vector3D(new Point3D(1,1,1), new Point3D(5,6,0)));
        assertTrue(res1 == 11 );
    }

    @org.junit.Test
    public void len() {
        double res = new Vector3D(new Point3D(1,1,1), new Point3D(1,1,3)).len();
        assertTrue(res == 2);
        double res1 = new Vector3D(new Point3D(1,1,1), new Point3D(0,3,3)).len();
        assertTrue(res1 == 3);
    }

    @org.junit.Test
    public void multiply() {
        Vector3D res = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).multiply(2);
        assertEquals(res, new Vector3D(new Point3D(2,2,2), new Point3D(4,6,8)));
    }

    @org.junit.Test
    public void add() {
        Vector3D res = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).add(
                new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)));
        assertEquals(res, new Vector3D(new Point3D(2,2,2), new Point3D(4,6,8)));
    }

    @org.junit.Test
    public void sub() {
        Vector3D res = new Vector3D(new Point3D(1,1,1), new Point3D(4,6,8)).sub(
                new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)));
        assertEquals(res, new Vector3D(new Point3D(0,0,0), new Point3D(2,3,4)));
    }

    @org.junit.Test
    public void vecX() {
        Vector3D res = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).vecX(
                new Vector3D(new Point3D(1,1,1), new Point3D(5,6,7)));
        assertEquals(res, new Vector3D(new Point3D(15,6,8), new Point3D(12,12,5)));
    }

    @org.junit.Test
    public void pcollin() {
        boolean res = new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)).pcollin(
                new Vector3D(new Point3D(1,1,1), new Point3D(2,3,4)));
        assertEquals(res, true);
    }
}