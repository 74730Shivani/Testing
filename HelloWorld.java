package com;
import java.util.Scanner;
public class AreaTriangle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ht;
	int be;
	float area=0.0f;
	System.out.println("Enter the height and base: ");
    ht=sc.nextInt();
    be=sc.nextInt();
    area = (be*(2.0f)*ht);
    System.out.println("Height = " +ht + "Base= " +be + "Area of triangle =" +area );
	}

	 
	}

 
