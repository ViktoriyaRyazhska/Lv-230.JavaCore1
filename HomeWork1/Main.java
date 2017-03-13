package com.company;

import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = in.nextDouble();
        double area = Math.PI*Math.pow(radius,2);
        double perimeter = 2*Math.PI*radius;
        System.out.println("Area is = "+area);
        System.out.print("Perimeter is = "+perimeter);


    }
}
