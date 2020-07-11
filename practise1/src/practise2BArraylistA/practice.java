package practise2BArraylistA;
import java.util.ArrayList;
import java.util.Scanner;

public class practice {
	static Scanner end;
	 public static void main(String[] args) {
		 ArrayList arrayListOne;
		    arrayListOne = new ArrayList();
		    ArrayList<Double> letterArray = new ArrayList<Double>();
		    Scanner input = new Scanner(System.in); 
		    try {
do {	    
	System.out.println("Type the required numbers:");	    
	while(true) {
		      letterArray.add(input.nextDouble());	      
		    }		  
	 }while(input==end );
	 }
		    catch(Exception e) {
				System.out.println("You have entered a character ending the scanning fn and displaying the array now.");
				displayList(letterArray);
				//trimToSize(letterArray);
			}	    
	 }
	 		
		 

		public static void displayList(ArrayList letterArray) {
			  System.out.println("Number of number in array: " + letterArray.size());
		      // Display eveything in the list
			 
		 
		  }
}
