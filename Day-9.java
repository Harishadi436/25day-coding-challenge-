package com.Demo;

import java.util.Scanner;

public class Demo1  {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the radius:");
		int rad=scr.nextInt();
		
		double Area;
		Area=3.142*rad*rad;
		System.out.println("Area of circle for radius "+rad+" is ="+ Area);
	}
	    
	    
}

	








