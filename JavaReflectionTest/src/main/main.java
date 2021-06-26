package main;

import java.util.Scanner;

import main.reflection.Test;
import question.Question;

public class main {

	public static void main(String[] args) {
		
		String className;
		String parameterI;
		String parameterII;
		String parameterIII;
		
		String response = Question.question("Are you a fool? Y/N");
		
		switch (response) {
		
			case "Y":
			case "YES":
				
				className = "main.factions.Legion";
				parameterI = "Caesar Legion";
				parameterII = "Caesar";
				parameterIII = "WeAreTheDeadOnSkirt";
				
			break;
			
			case "N":
			case "NO":
			case "YESN´T":
			
				className = "main.factions.NCR";
				parameterI = "New California Republic";
				parameterII = "Aaron Kimball";
				parameterIII = "GimmeTheDamnDam";
				
			break;
			
			default:
				
				className = "main.factions.House";
				parameterI = "RobCo Industries";
				parameterII = "Robert House";
				parameterIII = "ILikeRobots";
				
			break;
		
		}
		
		Test.instanceObjectByString(className, parameterI, parameterII, parameterIII);
		
	}

}
