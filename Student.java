package com;
import java.io.DataInputStream;
public class Student {

	public static void main(String[] args) {
		 DataInputStream in = new DataInputStream(System.in);
		 int rno=0;
		 String Name="";
		 float perc=0.0f;
		 try {
			 System.out.println("Enter rno,Name,perc");
			 rno= Integer.parseInt(in.readLine());
			 Name=in.readLine();
			 perc=Float.parseFloat(in.readLine());
		 }
		 catch(Exception e)
		 {
			 System.out.println("some error occured"+e);
			 System.exit(0);
		 }
		 System.out.println("Rno="+ rno  + "Name=" + Name  +"Perc=" + perc);
		 
	}

}
