package com.practice;
import java.util.Scanner;

public class calculator 
	{
	public static int add(int num1,int num2) 
	{
	return num1 + num2;
	}
	public static int subtract(int num1, int num2) 	
	{
        return num1 - num2;
	}
	public static int multiply(int num1, int num2) 
	{
		return num1 * num2;
	}
	public static int divide(int num1,int num2) 
	{
		return num1 / num2;
	}
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scr.nextInt();
		int num2=scr.nextInt();
		int Case;
		System.out.println("Enter the operation to perform (+, -, *, /)");
        String operation = scr.next();

        int result = 0;

        switch (operation) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
		
	}
}
