package practise2A;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;

public class DynamicArray1main {
	public static void main(String [] args)
	
	{   
		int[] arr = null; int  i=1; int count = 0;
		System.out.println("Enter the numbers: \n");
		Scanner input= new Scanner(System.in);
		try {
		do {
		arr[i] = input.nextInt();
		System.out.println(arr[i]);
		}
		while(input.hasNextInt());
		{
			i++; 
			int size = arr[i];
			for(int j=2; j<=size; j++ )
			arr[j] =input.nextInt();
		    
		}
		}
		catch(Exception e) {
			System.out.println("exception!!!");
		}
		}
	
		}


	
