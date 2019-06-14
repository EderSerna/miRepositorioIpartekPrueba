package com.ipartek.formacion;

import java.math.BigInteger;

public class BigTest {
	public static void main(String[] args) {
	   
	    
	        // Initialize result 
	        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
	  
	        // Multiply f with 2, 3, ...N 
	        for (int i = 2; i <= 1000; i++) 
	            f = f.multiply(BigInteger.valueOf(i)); 
	  
	        System.out.println(f);
	    
	}
}
