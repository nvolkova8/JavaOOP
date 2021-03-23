package com.company;

import static org.junit.Assert.*;

public class Vector3DTest {

    @org.junit.Test
    public void testEquals() {
        boolean res = new Vector3D(1,2,3).equals(
                new Vector3D(1,2,3));
        assertEquals(true, res);
        boolean res2 = new Vector3D(1,2,3).equals(
                new Vector3D(1,3,2));
        assertEquals(false, res2);

    }

    @org.junit.Test
    public void getX() {
        double res = new Vector3D(1,1,1).getX();
        assertTrue(res == 1);
        double res1 = new Vector3D(-3,3,4).getX();
        assertTrue(res1 == -3);
    }

    @org.junit.Test
    public void getY() {
        double res = new Vector3D(1,2,3).getY();
        assertTrue(res == 2);
        double res1 = new Vector3D(4,6,7).getY();
        assertTrue(res1 == 6);
    }

    @org.junit.Test
    public void getZ() {
        double res = new Vector3D(1,2,3).getZ();
        assertTrue(res == 3);
        double res1 = new Vector3D(1,0,6).getZ();
        assertTrue(res1 == 6);
    }

    @org.junit.Test
    public void scalar() {
        double res = new Vector3D( 1,2,3).scalar(
                new Vector3D(4,5,6));
        assertTrue(res == 32);
        double res1 = new Vector3D(1,2,3).scalar(
                new Vector3D(4,5,-1));
        assertTrue(res1 == 11 );
    }

    @org.junit.Test
    public void len() {
        double res = new Vector3D(0,0,2).len();
        assertTrue(res == 2);
        double res1 = new Vector3D(-1,2,2).len();
        assertTrue(res1 == 3);
    }

    @org.junit.Test
    public void multiply() {
        Vector3D res = new Vector3D(1,2,3).multiply(2);
        assertEquals(res, new Vector3D(2,4,6));
    }

    @org.junit.Test
    public void add() {
        Vector3D res = new Vector3D(1,2,3).add(
                new Vector3D(1,2,3));
        assertEquals(res, new Vector3D(2,4,6));
    }

    @org.junit.Test
    public void sub() {
        Vector3D res = new Vector3D(2,4,6).sub(
                new Vector3D(1,2,3));
        assertEquals(res, new Vector3D(1,2,3));
    }

    @org.junit.Test
    public void vecX() {
        Vector3D res = new Vector3D(1,2,3).vecX(
                new Vector3D(4,5,6));
        assertEquals(res, new Vector3D(-3,6,-3));
    }

    @org.junit.Test
    public void pcollin() {
        boolean res = new Vector3D(1,2,3).pcollin(
                new Vector3D(-2,-4,-6));
        assertEquals(res, true);
    }
}