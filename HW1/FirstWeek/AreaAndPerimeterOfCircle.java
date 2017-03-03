package com.edu;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double P = 2*Math.PI*radius;
        double S = Math.PI*radius*radius;
        System.out.println("Perimeter of circle is: " + P + " , " + "Area of circle is: " + S);
        
	}

}
