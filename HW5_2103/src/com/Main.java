package com;

public class Main {

	public static void main(String[] args) {
		
		Bird [] birds =  new Bird[4];
		
		birds[0]= new Eagle();
		birds[0].feathers=true;
		birds[0].layEggs=true;
		
		birds[1]= new Penguin();
		birds[1].feathers=false;
		birds[1].layEggs=true;
		
		birds[2]= new Swallow();
		birds[2].feathers=true;
		birds[2].layEggs=false;
		
		birds[3]= new Chicken();
		birds[3].feathers=true;
		birds[3].layEggs=true;
		
		for (int i = 0; i < birds.length; i++) {
			System.out.println(birds[i]);
			birds[i].fly();
			
		}
		
		

	}

}
