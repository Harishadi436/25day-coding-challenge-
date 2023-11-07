package com.java_coding;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		Scanner scr=new Scanner (System.in);
		System.out.println("Enter the Radius:");
		int radius=scr.nextInt();
		System.out.println("Choice 1 for Area of circle");
		System.out.println("Choice 2 for Area of Diameter of a circle");
		System.out.println("Choice 3 for Area of Circumference of a Circle");
		int Choice=scr.nextInt();
		
		switch(Choice){
		case 1:
			System.out.println("Area of circle:"+Math.PI*radius*radius);
			break;
		case 2:
			System.out.println("Diameter of a circle:"+2*radius);
			break;
		case 3:
			System.out.println("Circumference of a Circle:"+2*Math.PI*radius);
			break;
		case 4:
			System.out.println();
			break;
		}
	

	}

}
