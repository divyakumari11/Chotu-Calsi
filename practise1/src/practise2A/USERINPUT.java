package practise2A;
import java.util.Scanner;

public class USERINPUT {
	
	
	
		public static Object resizeArray(Object oldArray, int newSize )
		{
			int oldSize = java.lang.reflect.Array.getLength(oldArray);
			Class elementType = oldArray.getClass().getComponentType();
			Object newArray = java.lang.reflect.Array.newInstance(elementType, newSize);
            int preserveLength = Math.min(oldSize, newSize);
            if (preserveLength > 0)
               System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
         return newArray;
   
		}

    public static void main(String[] args) {
    	int i=0;
    
        Scanner input = new Scanner(System.in);

        //allow user input;
        System.out.println("How many numbers do you want to enter?");
        int num = input.nextInt();
       
        System.out.println("Enter the " + num + " numbers now.");

        double array;
		for (int i1 = 0 ; i1 < array.length; i1++ ) {
           array[i1] = input.nextInt();
        }
        System.out.println("enter the value of new elements:");
        i = input.nextInt();
        int array[] = new int[num];
        
        System.out.println("enter the new elements:");
        int[] a = (int[])resizeArray(num,i);

        System.out.println("These are the numbers you have entered.");
        printArray1(array);

        input.close();

    }
    public static void printArray1(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }





		
	}
