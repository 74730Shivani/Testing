package com;

public class ReversePattern {

	public static void main(String[] args) {
		 int i,j,row=8;
		//outer loop
		 for(i=row-1;i>=0;i--) {
			//inner loop
			 for(j=0;j<=i;j++) {
				 System.out.print("*#");
			 }
			     System.out.println();
				
		 }
		 
	}

}
