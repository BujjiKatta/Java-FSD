package Operation;

import java.util.Scanner;

public class ArithmeticOperation {
	char n;
	int a,b;

public static void main(String[] args)
{
	Scanner o =new Scanner(System.in);
	while(true){
		System.out.println("+-->Addition  \n- -->Subraction \n*--> Multiplication\n/--> Division\n.--> Exit");
		char n = o.next().charAt(0);
					
		switch(n){
		case '+':	System.out.println("Enter two numbers");
					int a=o.nextInt();
					int b=o.nextInt();
					System.out.println("Addition of two numbers : "+(a+b));
					break;
		case '-':	System.out.println("Enter two numbers");
					int c=o.nextInt();
					int d=o.nextInt();
					System.out.println("Subtraction of two numbers : "+(c-d));
					break;
		case '*':	System.out.println("Enter two numbers");
					int e=o.nextInt();
					int f=o.nextInt();System.out.println("Multiplication of two numbers : "+(e*f));
					break;
		case '/':	System.out.println("Enter two numbers");
					float g=o.nextFloat();
					float h=o.nextFloat();
					System.out.println("Division of two numbers : "+(g/h));
					break;
		case'.':	System.exit(0);
					break;
		}
	}
}
}


			
