package com.moodAnalyzer.java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
/**
 * To Check the Mood of the Person by String Entered.
 * Emphasis on - Junit Test Cases - Exception Handling - Custom Exceptions
 * Author 
 *
 * Testing Class of MoodAnalyzerTest
 * Created Object of Mood Analyzer
 * Created a Test Function and Imported Assertions and checking SAD or HAPPY
 */

public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyze = new MoodAnalyzer();

	 @Test
	    public void if_MessageWasSad_ShouldReturnSad(){
	        String message = "I am in Sad Mood";
	        String result1 = moodAnalyze.moodCheck(message);
	        Assertions.assertEquals("SAD",result1);
	}
	 @Test
	    public void if_MessageWasHappy_ShouldReturnHappy() {
		 String message = "I am in Happy Mood";
		 String result2 = moodAnalyze.moodCheck(message);
		 Assertions.assertEquals("HAPPY", result2);
	 }
}
