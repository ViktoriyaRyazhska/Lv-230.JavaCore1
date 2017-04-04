package com.edu2;

     class Chicken extends  NonFlyingBird{
    	 
	 public Chicken(String feathers, int layEggs) {
			super(feathers, layEggs);
		}

	public void fly(){
		 System.out.println("Chicken can't fly");
	 }; 
}
