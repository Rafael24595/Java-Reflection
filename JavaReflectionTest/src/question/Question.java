package question;

import java.util.Scanner;

public class Question {

	public static String question(String questionText) {
		Scanner keyboard = new Scanner(System.in);
		
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append(questionText);
		sbuilder.append("\n");
		
		System.out.print(sbuilder);
		
		String answer = keyboard.next();
	
		return answer.toUpperCase();
		
	}
	
}
