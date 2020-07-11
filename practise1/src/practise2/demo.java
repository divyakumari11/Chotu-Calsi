package practise2;
import java.util.ArrayList;
import java.util.Scanner;
 
public class demo {
	

	
	 
	   public void main(String[] args)
	   {
	      ArrayList<Double> numbers = new ArrayList<Double>();
	 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Please enter a list of numbers: ");
	       
	      String [] tokens = in.nextLine().split("\\s");
	       
	      for (int i = 0; i < tokens.length; i++)
	         numbers.add(Double.parseDouble(tokens[i]));
	    
	       
	      if (numbers.size() == 0)
	      {
	         System.out.println("No average.");
	 
	      } 
	       
	      else
	      {
	         double total = 0;
	         for (double element : numbers)
	         {
	            total = total + element;
	         }
	         double average = total / numbers.size();
	         System.out.println("The average is: " + average);
	 
	      }
	   }
	}

