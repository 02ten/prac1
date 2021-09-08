package com.company;
import com.company.Ball;
public class Main {

    public static void main(String[] args) {
	System.out.println("Hello world!");
    Ball ball1 = new Ball();
    Ball ball2 = new Ball("Green", 12.6f);
    Ball ball3 = new Ball("Red");
    Ball ball4 = new Ball(10.5f);
    ball2.throwBall();
    ball1.setColor("White");
    ball4.setColor("Yellow");
    ball3.setRadius(13.5f);
    ball1.setRadius(8.3f);
    System.out.println(ball2.toString());
    }
}
