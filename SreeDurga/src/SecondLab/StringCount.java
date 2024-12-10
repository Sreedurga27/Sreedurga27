// write a java program to count the occurrences of each character in a string //


package String;

public class StringCount {

	public static void main(String[] args) {
		
		//input string 
		String input= "programming";
		
		// convert the string to a char array
		char[] characters = input.toCharArray();
		
		//loop through each character in the string
		for(int i =0; i< characters.length; i++) {
			
			//count the occurrences of each character
			if(characters[i] != '\0') {
				int count =1;
				for(int j=i+1; j<characters.length; j++) {
					if(characters[i] == characters[j]) {
						count++;
						characters[j]= '\0';
					}
				}
				//print the character and its count
				System.out.println(characters[i] + ":" + count);
			}
		}
	}

}
