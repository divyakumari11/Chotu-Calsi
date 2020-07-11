package practise2BArraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.*;
import java.lang.*;
import java.util.*;
public class DynamicArrayList {
	private static List<String> getAndPrintInputFromUser() {

	    TreeSet<String> ids = new TreeSet<String>(); //used set for making list as unique
	    Scanner input = new Scanner(System.in);
	    System.out.println("\nEnter each value\n" +
	            "and Put an extra ENTER .");
	    do{

	        String x = input.nextLine();

	        Object Stringutils;
			if(x==null || Stringutils.isEmpty(x.trim())){
	            break;
	        }else {
	            ids.add(x);
	        }

	    }while(true);

	    for(String id : ids)
	        System.out.println(id);

	    return new ArrayList<String>(ids);
	}

}
	