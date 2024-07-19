package Practice;



public class Windows_Handle {
	//To check whether str1 and str2 char matches or not using Arrays.sort() function;
	public static void main(String[] args) {



		String inputString = "hello world";
		countCharacters(inputString);
	}

	public static void countCharacters(String str) {
		int[] charCount = new int[250]; // Assuming ASCII characters

		// Iterate through each character in the string
		for (char c : str.toCharArray()) {
			// Ignore spaces
			if (c == ' ')
				continue;

			// Increment the count for the current character
			charCount[c]++;
		}

		// Print the character count
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println("'" + (char) i + "' : " + charCount[i]);
			}
		}
	}

}