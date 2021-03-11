/**
 * @author: Khalid Alrashedi
 * @Date/Time:   Thu.3/12/2021  2:00 PM (UTC) 
 * @Application: Optimized Characters Counter
 */

public class OptimizedCharacterCounter {
	
  public static void main(String[] args) {
			System.out.println(RunLength("a").equals("1a"));
			System.out.println(RunLength("aa").equals("2a"));
			System.out.println(RunLength("baa").equals("1b2a"));
			System.out.println(RunLength("bbbaa").equals("3b2a"));
			System.out.println(RunLength("aabbcde").equals("2a2b1c1d1e"));
			System.out.println(RunLength("wwwbbbw").equals("3w3b1w"));		
  } // end main method
		
  public static String RunLength(String str) {
			
      String res = ""; // To concatenate characters
      str += '\0'; // Assign stop flag to the end of string.
		
    // loop to navigate all characters in string.
    // False, if loop encounters '\0' character
      for(int i = 0, counter = 1; str.charAt(i) != '\0'; i++, counter++){
        
        // False, if character does not equal following character
        if(str.charAt(i) != str.charAt(i + 1)) { 
          res = res + counter + str.charAt(i); // concatenation
          counter = 0; // assign zero to counter
        } // end if statement
        
      } // end for loop 
    return res; // return result
    } // end RunLength method
} // end CharacterCounterOptimized class
