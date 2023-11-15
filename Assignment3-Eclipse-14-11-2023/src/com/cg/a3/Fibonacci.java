package com.cg.a3;

public class Fibonacci {
	
		public static void main(String[] args) {
			
			int n=20;
			System.out.println("Fibonacci series up to  "+n+"  terms:");
			int firstTerm=0,secondTerm=1;
			for(int i=0;i<n;i++) {
				System.out.println(firstTerm+" ");
				int nextTerm=firstTerm+secondTerm;
				firstTerm=secondTerm;
				secondTerm=nextTerm;
			}
	 
		}
	 
	}


