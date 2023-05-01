package com;

public class ReverseNumberr {

	public static void main(String[] args) {
		 int number=1234, reverse=0;
		 while(number!=0) {
			int remainder=number%10;//  remainder=4
			reverse=reverse*10+remainder;//reverse=4
			number=number/10;//123
		 }
			System.out.println("the reverse of given number is:"+reverse);
			
			 
		 }
	}


