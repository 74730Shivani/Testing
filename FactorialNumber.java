
package com;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		int i,n;
		 long fact=1;
		System.out.println("Enter the factorial value:");
		n=sc.nextInt();
		i=1;
		while(i<=n) {
			fact=fact*i;
			i++;
			
		}System.out.println("Factorial of "+n +"="+fact);
		
	}
}
