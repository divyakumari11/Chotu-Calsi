package practise2;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
public class demo2 {
	

	public class JavaApplication1156 {

	    public  void main(String[] args) {
	    System.out.println("Enter numbers here");
	    int sum;
	    do {
	        Scanner kb = new Scanner(System.in);
	        int score = 0;
	        sum = 0;
	        String line = kb.nextLine();
	        kb = new Scanner(line); //has to do this to make the kb.hasNexInt() work.
	        while (kb.hasNextInt()) {
	            score = kb.nextInt();
	            sum += score;
	        }
	        if (sum <= -1)
	        System.out.println("Application ended");
	        else if (sum >= 0)
	        System.out.println("Sum = " + sum);

	    } while (sum != -1);
	  }

	}
}
