/**
 * @author: Khalid Alrashedi
 * @Date/Time:   Wed.3/10/2021  8:09 AM (UTC) 
 * @Application: Characters Counter
 */
public class CharacterCounter {
	
	public static void main(String[] args) {
		System.out.println(RunLength("a").equals("1a"));
		System.out.println(RunLength("aa").equals("2a"));
		System.out.println(RunLength("baa").equals("1b2a"));
		System.out.println(RunLength("bbbaa").equals("3b2a"));
		System.out.println(RunLength("aabbcde").equals("2a2b1c1d1e"));
		System.out.println(RunLength("wwwbbbw").equals("3w3b1w"));		
	} // end main method
	
	public static String RunLength(String str) {
		
		int counter = 1; // To count characters
		String res = ""; // To concatenate characters

		// loop to navigate all characters in string.
		for(int i = 0; i < str.length(); i++){
			
			if(i == str.length() - 1) // False, if i variable reaches last element of str.
			  res = res + counter + str.charAt(i); // concatenation
			 else if(str.charAt(i) == str.charAt(i + 1)) // False, if the character does not equal the following character.
				 counter++; // increment character's number
			   else{ // Otherwise
				   res = res + counter + str.charAt(i); // concatenation
				   counter = 1; // set counter back to one
				 }
		    } // end for loop
		  return res; // return res 
	  } // end RunLength method
} // end CharacterCounter class
