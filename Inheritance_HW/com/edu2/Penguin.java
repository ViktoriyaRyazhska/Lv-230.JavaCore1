package com.edu2;

     class Penguin  extends NonFlyingBird{

	public Penguin(String feathers, int layEggs) {
			super(feathers, layEggs);
		}

	public void fly(){
		 System.out.println("Penguin can't fly");
	 };
}
