package com.edu5;

public class CalculatesTheDividing {
	 public static void main(String[] args) {
	        System.out.println(2/0);
	        try {
	            System.out.println(div(6.0, 3));
	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
	    }
	    public static double div(double a, double b){
	        return a/b;
	    }
}
