package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fruit = {"Apple", "Banana", "Orange", "Grapes", "Pineapple"};		
		//2. print the third element in the array
		System.out.println(fruit[2]);
		
		//3. set the third element to a different value
		fruit[2] = "Strawberries";
		
		//4. print the third element again
		System.out.println(fruit[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0;i<fruit.length;i++) {
			System.out.println(fruit[i]);
		}
		
		
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		
		Random rand = new Random();
		
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0;i<numbers.length;i++) {
			numbers[i] = rand.nextInt(50);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(numbers[0]);
		
		//9 print the entire array to see if step 8 was correct
		for(int i = 0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		//10. print the largest number in the array.
		System.out.println(numbers[49]);
	}
}
