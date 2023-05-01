package com;

public class pyramid {

	public static void main(String[] args) {
		 int i,j,row=6;
		 //outer loop
		     for(i=0;i<row;i++) {
			 //inner loop
			 for(j=row-i;j>1;j--) {
			     System.out.print("");
			 }
			 for(j=0;j<=i;j++) {
				 System.out.print("*"); 
			 }
			 System.out.println();
		 }
	}

}
