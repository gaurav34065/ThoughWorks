package com.barclays;

public class Rectangle {

    private double height;
    private double breadth;

    public Rectangle(double height, double breadth) {
        this.height = height;
        this.breadth = breadth;
    }

    public double perimeter(){
        return 2*(height+breadth);
    }
    public  double area(){
        return (height*breadth);
    }

}
