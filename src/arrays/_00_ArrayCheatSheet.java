package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"a", "b", "c", "d", "e"};
		
		//2. print the third element in the array
		System.out.println(array[3]); 
		
		//3. set the third element to a different value
		array[3] = "x"; 
		
		//4. print the third element again
		System.out.println(array[3]); 
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<array.length; i++ ){
			System.out.println(array[i]); 
		}
		
		//6. make an array of 50 integers
		int[] w = new int[50]; 
		
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random(); 
		for(int i = 0; i<50; i++) {
			int x = rand.nextInt(1000);
			w[i] = x; 
			System.out.println(w[i]); 
	
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int y = 1000; 
		
		for(int i =0; i<50; i++) {
			 if(w[i] < y) {
				 y=w[i]; 
			 }
		}
		System.out.println(y); 
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
