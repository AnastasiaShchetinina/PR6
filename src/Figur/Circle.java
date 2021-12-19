package Figur;
import java.lang.*;
import java.security.PublicKey;

public class Circle {
    private int x;
    private int y;
    private double r;

    public Circle(int x, int y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }

    public double getlength (){
        double length = 2*3.14*this.r;
        return length;
    }
    public double getArea (){
        double area = Math.PI*Math.pow(r,2);
        return area;
    }
    public double getLength() {
        double l = 2 * Math.PI * this.r;
        return l;
    }
    public double getS() {
        double s = Math.PI * Math.pow(r,2);
        return s;
    }
}

