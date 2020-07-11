//CLACULATOR WITH ACCEPTING VALUES OF ANY DATA TYPE
package practise2;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
public class allTypeCalc {
	public static void main( String[] args)
	{
char operator;
double num1,num2,ex;
double answer=0;
do {
Scanner sc= new Scanner(System.in);
Scanner input= new Scanner (System.in);
System.out.println("Enter the first number:");
num1 = input.nextDouble();
System.out.println("enter the second number:");
num2 = input.nextDouble();
System.out.println("choose the operation to be performed");
operator=input.next().charAt(0);
switch(operator)
{
case '+' :	addTwoNo atn = new addTwoNo();
            atn.addTwoNumber(num1,num2);
			break;
case '-':   subTwoNo diff = new subTwoNo();
			diff.subTwoNumber(num1,num2);
			break;
case '*':   mulTwoNo product = new mulTwoNo();
            product.mulTwoNumber(num1,num2);
            break;
case '/':	divTwoNo result = new divTwoNo();
            result.divTwoNumber(num1,num2);
            break;           
case '%':   modTwoNo mod = new modTwoNo();
			mod.modTwoNumber(num1,num2);
			break;
default :   System.out.println("The chosen operator is not available for operation");  
			break;
}
System.out.println("Do you want to continue? 1. yes 2.no");
ex=sc.nextInt();
	}
	while(ex==1);

	 {
		System.out.println(" Program execution ends here.THANK YOU!!! happy coding\n");

	
}
}
}




	









	

