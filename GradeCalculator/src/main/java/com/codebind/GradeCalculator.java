package com.codebind;

public class GradeCalculator {

	public static String calculateGrade(int gradeNum) {
		String result = "";
		if (gradeNum > 100) {
			result = "Wrong grade number";
		} else if (gradeNum >= 90) {
			result = "A";
		} else if (gradeNum >= 80) {
			result = "B";
		} else if (gradeNum >= 70) {
			result = "C";
		} else if (gradeNum >= 60) {
			result = "D";
		} else if (gradeNum >= 0) {
			result = "F";
		} else {
			result = "Wrong grade number";
		}
		return result;
	}
	
	public static String calculateGrade(String grade) {
		int gradeNum = -1;
		try {
			gradeNum = Integer.parseInt(grade);
		} finally {
			String gradeLetter = calculateGrade(gradeNum);
			return gradeLetter;
		}
	}
}
