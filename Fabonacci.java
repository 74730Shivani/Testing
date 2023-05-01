package com;
import java.util.Scanner;
public class Fabonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,a,b,c;
		System.out.println("How many fabonacci number:");
		n=sc.nextInt();
		a=0; b=1;
		System.out.println(a+" "+b +" ");
		for(i=0;i<=n;i++) {
			c=a+b;
			System .out.println(c+" ");
			a=b;
			b=c;
			
		}
		
	}

}
