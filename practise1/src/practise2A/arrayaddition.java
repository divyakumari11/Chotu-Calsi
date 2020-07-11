package practise2A;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
public class arrayaddition {
	public static void main(String [] args)
	{
		int[] arr = new int[5];
		int sum=0;
	for(int num:arr)
	{
		sum=sum+num;
	}
	System.out.println("Sum of array elements is:" +sum);

}
}