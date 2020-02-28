import java.util.Scanner;

public class ExecuteSequence {

	public static void main(String[] args) {
		/*
		//Program allows for User Input if wanted
		Number userEnteredNumber = new Number();
		
		prompt();
		Scanner sc = new Scanner(System.in);
		
		String userInput = sc.nextLine();
		
		while(!userInput.toLowerCase().equals("exit")) {
			if(testParseableString(userInput) && Integer.parseInt(userInput) < 0) {
				System.out.println("We cannot calculate a negative Fibonacci sequence.\n"+
						"Please try another value.");
			}
			else if(testParseableString(userInput)) {
				userEnteredNumber.setNumber(Integer.parseInt(userInput));
				System.out.println(Number.recursiveFibonacci(userEnteredNumber.getNumber()));
				System.out.println(Number.iterativeFibonacci(userEnteredNumber.getNumber()));
			}
			else if(userInput.toLowerCase().equals("exit")) {
				break;
			}
			else {
				System.out.println("The value entered [" + userInput + "] is not an integer or a whole number value.\n"+
						"Please try another value.");
			}
			prompt();
			userInput = sc.nextLine();
		}
		System.out.println("Exiting program.");
		sc.close();
		*/
		Number fibSequenceOne = new Number (3);
		Number fibSequenceTwo = new Number (5);
		Number fibSequenceThree = new Number (7);
		Number fibSequenceFour = new Number (8);
		
		System.out.println("Starting calculations for position number " + fibSequenceOne.getNumber() + " in the Fibonacci sequence.");
		System.out.println(Number.recursiveFibonacci(fibSequenceOne.getNumber()));
		System.out.println(Number.iterativeFibonacci(fibSequenceOne.getNumber()));
		
		System.out.println("Starting calculations for position number " + fibSequenceTwo.getNumber() + " in the Fibonacci sequence.");
		System.out.println(Number.recursiveFibonacci(fibSequenceTwo.getNumber()));
		System.out.println(Number.iterativeFibonacci(fibSequenceTwo.getNumber()));
		
		System.out.println("Starting calculations for position number " + fibSequenceThree.getNumber() + " in the Fibonacci sequence.");
		System.out.println(Number.recursiveFibonacci(fibSequenceThree.getNumber()));
		System.out.println(Number.iterativeFibonacci(fibSequenceThree.getNumber()));
		
		System.out.println("Starting calculations for position number " + fibSequenceFour.getNumber() + " in the Fibonacci sequence.");
		System.out.println(Number.recursiveFibonacci(fibSequenceFour.getNumber()));
		System.out.println(Number.iterativeFibonacci(fibSequenceFour.getNumber()));
	}
	
	//Methods used by the user entered number program.
	//Tests if the string can be parsed to in an Int value. Helps with the conditional statements and
	//allows to check if the value is parseable without causing the program to crash.
	public static boolean testParseableString(String userInput) {
		try {
			Integer.parseInt(userInput);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	//Menu prompt used in the user input feature. Unused with the hard coded values
	public static void prompt() {
		System.out.println("Please enter the number of the Fibonacci sequence you would like to see: ");
		System.out.println("Type 'exit' to quit the program.");
	}
}
