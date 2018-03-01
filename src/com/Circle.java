package com;

import java.util.Random;
import java.util.Scanner;

import static com.SafeScanner.nextDouble;

public class Circle{

    private double radius;
    private double x,y;


    public Circle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты центра круга");
        x = nextDouble(scanner);
        y = nextDouble(scanner);
        /*в задании не прописано указание радиуса, однако без него нельзя найти
        как длину окружности, так и пересечение с другой окружностью
        */
        radius = Math.random()*10;
    }

    public double getCircuit() {
        return Math.PI*2*radius;
    }

    public void moveCircle(){
        Random random = new Random();
        x = Math.random()*100-99;
        y = Math.random()*100-99;

    }

    public double distanceBetweenCircles(Circle circle){
        return Math.sqrt(Math.pow(this.x-circle.getX(),2)+Math.pow(this.y-circle.getY(),2));
    }
    public boolean iscollised(Circle circle){
        if(this.radius==circle.getRadius() && distanceBetweenCircles(circle)==0)
            return true;
        if (this.radius>circle.getRadius()){
           if (distanceBetweenCircles(circle)>this.radius+circle.getRadius())
               return false;
           if (distanceBetweenCircles(circle)<this.radius-circle.getRadius())
               return false;
        }
        else{
            if (distanceBetweenCircles(circle)>this.radius+circle.getRadius())
                return false;
            if (distanceBetweenCircles(circle)<circle.getRadius()-this.getRadius())
                return false;
        }
        return true;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void describe(){
        System.out.println("radius = " + radius);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
