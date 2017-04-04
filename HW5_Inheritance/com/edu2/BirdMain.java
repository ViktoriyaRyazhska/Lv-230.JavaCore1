package com.edu2;

public class BirdMain {

	public static void main(String[] args) {
		
		Bird [] birds = new Bird [4];
		birds [0] =	new Eagle("Eagle despite the reduced size of aerodynamic feathers", 5);
		birds [1] = new Swallow("Swallow have nine primary feathers", 7);
		birds [2] = new Penguin("Penguin have a thick layer of insulating feathers", 3);
		birds [3] = new Chicken("Chicken have a pointed feathers on their necks", 2);
		
        for(int i = 0; i < birds.length;i++){
        	birds[i].fly();
      }
        
       for (Bird birdy : birds){
    	   System.out.println(birdy);
       }
    }
}