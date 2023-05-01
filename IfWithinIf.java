package com;
import java.util.Scanner;
public class IfWithinIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int day;
		System.out.println("Enter a number betwen 1 to 7:");
		day= sc.nextInt();
		if (day==1)
			System.out.println("It is Monday");
		else
			if (day==2)
				System.out.println("It is Tuesday");
			else
				if (day==3)
					System.out.println("It is wendsday");
				else
					if (day==4)
						System.out.println("It is Thursday");
					else
						if (day==5)
							System.out.println("It is Friday");
						else
							if (day==6)
								System.out.println("It is saturday");
							else
								if (day==7)
									System.out.println("It is sunday");
								else
									System.out.println("Unknown number");
			
								
	}

}
