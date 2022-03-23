package com.company;

public class Main {

    public static void main(String[] args) {
        Circle.setRadius(10);
        System.out.println(Circle.area());
        System.out.printf("%.1f",Circle.circumference());
    }
}
