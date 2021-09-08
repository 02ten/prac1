package com.company;

public class Ball {
    private float radius;
    private String color;

    public Ball(String color, float r){
        this.color = color;
        this.radius = r;

    }
    public Ball(String color){
        this.color = color;
        this.radius = 0;
    }
    public Ball(float r){
        this.color = "";
        this.radius = r;
    }
    public Ball(){
        this.color = "";
        this.radius = 0;
    }

    public void setRadius(float r){
        this.radius = r;
    }
    public void setColor(String color){
        this.color = color;
    }
    public float getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void throwBall(){
        System.out.println("You have thrown the "+this.color+" ball");
    }
    public String toString() {
        return "This is "+this.color+ " ball with radius = "+this.radius;
    }
}
