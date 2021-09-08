package com.company;
public class Main {


    public static void main(String[] args) {
	System.out.println("Hello world!");
    testBallClass();
    testBookClass();



    }
    public static void  testBallClass(){
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

    public static void testBookClass(){
        Book book1 = new Book();
        Book book2 = new Book(200,"asdasd", "asdada" );
        Book book3 = new Book(150, "asd");
        book3.setAuthor("123");
        book1.setName("asda");
        book1.setAuthor("asdasd");
        book1.setPrice(1000);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
