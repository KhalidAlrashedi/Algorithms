/**
 * @author: Khalid Alrashedi
 * @Email: bm140k@gmail.com
 * @Date/Time: 2021/15/3  2:23 PM UTC
 * @Application: Acceptance Prediction for Game-Changer program
 * @Description: This application meant for individual coders applicants to predicate percentage of acceptance to Game-changer
 *  counting on remaining days, number of applicants and Self-Assessment Factors.     
 */

import java.util.Scanner;
public class Predication {
	
	// Available Information
	//	 >> number of applicants.   
	//	 >> remaining days.
	//	 >> applicant provide information for self-assessment.  
	
	// Percentage Calculation Section
	//	<> number of applicants.								                30%   
	//	<> remaining days.										                  20%
	//	<> applicant provide information for self-assessment.  	50%

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int remainingDays; // remaining days
		int applicants; // number of applicants
		int res; // result 
		double daysPercentage; //
		double applicantPercentage; // Percentage of choosing applicant
		double acceptencePredication; // Predication of acceptance
		final double ACCEPTENCE_DAYS = 8; // from 14th Mars to 21th Mars
		final int CODERS_ACCEPTENCE = 20; // Number of coders for The first batch
		
		System.out.println("\tGeneral Questions"); // Address 
		System.out.println("!!Rminder: Finall day is 21th Mars!!\n Remaining Days from 14th Mars:"); // prompt the user to enter remaining 
		remainingDays = input.nextInt(); // obtain number of remaining days.
		System.out.println("Number of applicants:"); // prompt user to enter number of applicants
		applicants = input.nextInt();// obtain Number of applicants.
		
		// the less days, the more chances to be accepted 
		daysPercentage = (ACCEPTENCE_DAYS-remainingDays)/ ACCEPTENCE_DAYS * 30; // Evaluate expression to find percentage to find days
		
		// the more applicants, the less chances to be accepted 
		applicantPercentage = CODERS_ACCEPTENCE /  (double)applicants * 20; // Evaluate expression to find percentage to find applicants
		
		res = SelfAssessment(); // calling SelfAssessment method to get result out of 50%
		
		acceptencePredication = daysPercentage + applicantPercentage + res; // find prediction 
		System.out.println("The acceptence predication is " + acceptencePredication + "% out of 100%");
	}
	
	public static int SelfAssessment() {
		Scanner input = new Scanner(System.in);
		int res = 0;
		System.out.println("\tSelf-Assessment"); // Address
		System.out.println("Rate the questions from (Not good) 1 to (very good) 10"); // Clarification 
		
		System.out.println("  PHASE 3: INTERVIEW >>"); // INTERVIEW SATGE
		System.out.println("Behavioral Section:"); // QUESTION 1
		res += input.nextInt(); // obtain rate's number
		System.out.println("Live Coding Challange"); // QUESTION 2
		res += input.nextInt(); // obtain rate's number

		System.out.println(" PHASE 2: EXAM >>"); // EXAM STAGE
		System.out.println("!! Reminder: Section 1 was about evlaution of problem-solving !!" // REMINDER
				+ "\n  Section 1:"); // QUESTION 1
		res += input.nextInt(); // obtain rate's number
		System.out.println("!! Reminder: Section 2 was about evaultion of Mathmatics, physicse & general knowledge !!" // REMINDER
				+ "\n  Section 2:"); // QUESTION 2
		res += input.nextInt(); // obtain rate's number
	
		System.out.println("  PHASE 1: Applicante's information:"); // APPLICANT'S INFORMATION STAGE <<>> QUESTION 1
		res += input.nextInt();
		
		return res; // return result to caller.
	}
}

// Unavailable information
//   >> Applicants information.
//	 >> Exam: Section 1 & Section 2 results
//   >> interview 
