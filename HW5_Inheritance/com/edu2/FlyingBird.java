package com.edu2;

    class FlyingBird extends Bird{
    	
	public FlyingBird(String feathers, int layEggs) {
			super(feathers, layEggs);
		}

	@Override
	 public void fly(){
		 System.out.println("Birds can fly at a height of 1 to 11 300 meters");
	 };
}
