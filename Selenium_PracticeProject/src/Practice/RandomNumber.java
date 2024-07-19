package Practice;

import java.util.Random;

public class RandomNumber {

	
		
		 // Create a Random object
		public static int number() {
			Random random = new Random();

	        // Generate a random number between 1 and 9999
	        int randomNumber = random.nextInt(9999) + 1;
	        return randomNumber;
		}
        
	
     public static void main(String[] args) {
    System.out.println(number());
}
}