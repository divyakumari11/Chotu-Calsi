//with user input
package practise2;
import java.util.Scanner;
//import java.io.*;
//import java.lang.*;
//import java.util.*;
public class calculate2 {
	char operator;
	public static void main(String [] args)
	{
		addTwoNo atn = new addTwoNo();
		Scanner input= new Scanner (System.in);
		System.out.println("Enter the values:");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		atn.addTwoNumber(num1,num2);
		
		subTwoNo diff = new subTwoNo();
		Scanner value= new Scanner (System.in);
		System.out.println("Enter the values:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		diff.subTwoNumber(a,b);
		
	}	
}