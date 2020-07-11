package practise2;

public class addfun {
	 double size=0;
		double count=0;
	 public void add(int data) 
	    { 
	  
	       
			// check no of element is equql to size of array 
	        if (count == size) { 
	            growSize(); // make array size double 
	        } // insert element at end of array 
	        double [] array = null;
			array[(int) count] = data; 
	        count++; 
	    }

	 
		// TODO Auto-generated method stub
		 public void growSize() 
		    { 
		  
		        int temp[] = null; 
		        if (count == size) { 
		  
		            // temp is a double size array of array 
		            // and store array elements 
		            temp = new int[(int) (size * 2)]; 
		            { 
		                for (int i = 0; i < size; i++) { 
		                    int[] array = null;
							// copy all array value into temp 
		                    temp[i] = array[i]; 
		                } 
		            } 
		        } 
	} 
}
