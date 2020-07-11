package practise2A;

import java.util.Scanner;

public class DynamicArray1 {
 int[] array;
 int count;
 int size;
 
 //constructor
 public DynamicArray1()
 {
	 array = new int[2];
	 count=0;
	 size=2;
 }

 public void growSize() 
 { 

     int temp[] = null; 
     if (count == size) { 
         temp = new int[size * 2]; 
         { 
             for (int j = 0; j < size; j++) { 
                 temp[j] = array[j]; 
             } 
         } 
     } 
     array = temp; 
     size = size * 2; 
 }

 public void add(Scanner sc) {
	if (count == size) { 
        growSize(); 
    } 
  //  double i;
	array[sc] = sc.nextInt(); 
    count++;
	
}

} 


