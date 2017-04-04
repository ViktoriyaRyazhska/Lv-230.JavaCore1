package com.edu;

public class ErrorsClass {

	private int numberOfErrors;
	
	 public ErrorsClass (int numberOfErrors) {
			this.numberOfErrors = numberOfErrors;
		}
	 
	public String logicErrors(){
		
		String errorsName;
		
		Errors error;
		
		 switch(numberOfErrors){
		    case 400:  
		    	error = Errors.Bad_Request;
		    	System.out.println(error);
		    	errorsName = "Bad_Request";
		   break;
		    
		    case 401:  
		    	error = Errors.Unauthorized;
		    	System.out.println(error);
		    	errorsName = "Unauthorized";
		    break;
		    
		    case 402:  
		    	error = Errors.Payment_Required;
		    	System.out.println(error);
		    	errorsName = "Payment_Required";
		    break;
		    
		    case 403:  
		    	error = Errors.Forbidden;
		    	System.out.println(error);
		    	errorsName = "Forbidden";
		    break;
		    case 404:  
		    	error = Errors.Not_Found;
		    	System.out.println(error);
		    	errorsName = "Not_Found";
		    break;
		    
		    case 405:  
		    	error = Errors.Method_Not_Allowed;
		    	System.out.println(error);
		    	errorsName = "Method_Not_Allowed";
		    break;
		    
		    case 406:  
		    	error = Errors.Not_Acceptable;
		    	System.out.println(error);
		    	errorsName = "Not_Acceptable";
		    break;
		    
		    default:
		    System.out.println("We dont have information about this error.");
		    errorsName = "We dont have information about this error.";
		 }
		return errorsName;
	}
}
