//write program for multiplication of table of given number
package com;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,n,k;
		System.out.println("Multipliaction of which number you want:");
		n=sc.nextInt();
		i=1;
		while(n<=10){
			k=n*i;
			i++;
			
		}
		System.out.println(n+"*"+i+"="+ k);
		  
	}

}
