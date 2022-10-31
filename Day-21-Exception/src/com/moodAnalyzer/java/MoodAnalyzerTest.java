package com.moodAnalyzer.java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyze = new MoodAnalyzer();

	@Test
	public void if_MessageWasSad_ShouldReturnSad() {

		String message = "I am in SAD Mood";
		String mood = moodAnalyze.moodCheck(message);
		Assertions.assertEquals("SAD", mood);
	}
}
