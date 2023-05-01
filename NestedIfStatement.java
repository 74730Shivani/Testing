//Calculator of two number
package com;
import java.util.Scanner;
public class NestedIfStatement {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 int a,b;
		 String op;
		 float res;
		 System.out.println("Enter 2 numbers and operator:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 op=sc.next();
		 if(op.equals("+"))
		 {
			 res = a+b;
			 System.out.println("Result = " + res);
		 }
		 else
			 if(op.equals("-")) {
				 res = a-b;
				 System.out.println("Result = " + res);
			 }
			 else
		         if(op.equals("*")) {
			        res = a*b;
			        System.out.println("Result = " + res);
		         }
		         else
		            if(op.equals("/")) {
			        res = (float)a/b;
			        System.out.println("Result = " + res);
		 
		            }
		            else {
		            	System.out.println("Not a operater");
		            }
	}

}
