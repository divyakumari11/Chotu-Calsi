//ARRAY CREATION AND THEN ADDITION OF ELEMENTS//
package practise2A;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;

public class calc3main {
	public static void main( String[] args)
	{
		double j = 0;

double sum=0;
System.out.println("Enter the value of 'j' inorder to specify the number of elements in the array: \n");
Scanner jn= new Scanner(System.in);
		j =jn.nextInt();
		double[] arr = new double[(int) j];
Scanner sc= new Scanner(System.in);

System.out.println("Enter the numbers you want to add as array elements: \n");


for (int i = 0; i < arr.length; i++) {
	
	arr[i] =sc.nextInt(); // storing random integers in an array
		}
System.out.println("The array elements are: \n");
for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);

//function to display array element//
System.out.println("The size of "
        + "the array is "
        + arr.length); 

//function to add array elements//
for(double num:arr)
{
	sum=sum+num;
}
System.out.println("Sum of array elements is: \n" +sum);
	
}
}