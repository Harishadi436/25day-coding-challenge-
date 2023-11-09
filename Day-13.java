package com.java_coding;
import java.util.*;
public class Reverse_number {
	    public static void main(String [] args) {
	        Scanner scr = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int num = scr.nextInt();
	        int c = 0; 
	        while(num > 0){
	            int b = num % 10;
	            c = c * 10 + b; 
	            num = num / 10;
	        }
	        System.out.println("Reverse of number:"+c);
	    }
	}



