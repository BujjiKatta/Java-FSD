package bujji;

import java.util.Scanner;

public class ArithmeticOperation {

			public static void main(String[] args) {
				Scanner in =new Scanner(System.in);
				System.out.println("Enter number 1 :");
				int num1=in.nextInt();
				System.out.println("Enter number 2 :");
				int num2=in.nextInt();
				int addition=num1+num2;
				int subtraction=num1-num2;
				int multiplication=num1*num2;
				int division=num1/num2;
				System.out.println("Addition of two numbers: " +addition);
				System.out.println("Subtraction of two numbers: " +subtraction);
				System.out.println("Multiplication of two numbers: " +multiplication);
				System.out.println("Division of two numbers: " +division);		
			}

		}

	


