//Write a program in java without using the third variables
package com;
import java.util.*;
public class SwapNumberEx2 {

	public static void main(String[] args) {
		System.out.println("Enter the values of x and y");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("before swap:"+x+" "+y);
		//swaping 
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap:"+x+" "+y );
		
	}
	}

		 
