package com.edu.udea.appempresariales.examples;

public class CodeBreaker {
   
	private String vencer ;
	
	public CodeBreaker(String aVencer) {
		vencer = aVencer;
	}
	
	public String verify(String i) {
		if(i.equals(vencer)){		
		return "xxxx";
		}else if(i.equals(vencer)){
			return" ";
		}
	}

}
