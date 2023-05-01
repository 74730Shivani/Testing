//Single Condition or one way condition
//find largest number in n number
package com;
 import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,n,large;
		int k;
		System.out.println("How many number:");
		n= sc.nextInt();
		large=0;
		for (i=1;i<=n;i++) {
			System.out.println("Enter a number:");
			k=sc.nextInt();
			if(k > large)
				large= k;
			
		}
		System.out.println("Largest number is:" + large);
	}
}

	
