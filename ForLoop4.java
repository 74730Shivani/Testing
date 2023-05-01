//Write a program for prime number.
//prime number is greATER than 1 and divided by itself.
package com;

public class ForLoop4 {

	public static void main(String[] args) {
		int i,m=0,flag=0;
		int n=6;// it is number to bne checked
		m=n/2;
		
				if (n==0||n==1) 
		{
			System.out.println(n+"id=s not prime number");
		}else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+"is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+"is prime number");}
			}
		}
		
	}


