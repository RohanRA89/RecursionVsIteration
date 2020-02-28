
//Just using a class to handle the number values.
//Could have used an int value in the main but was just using this as practice.
public class Number {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Number(int number) {
		super();
		this.number = number;
	}
	
	public Number() {
		super();
	}
	
	//Recursive calculations
	public static int recursiveFibonacci(int n) {
		long calculationTime = System.nanoTime();
		
		if(n < 2) {
			System.out.println("Recursive calculation time: " + calculationTime);
			return n;
		}
			return (recursiveFibonacci(n-1) + recursiveFibonacci(n-2));
	}
	
	//Iterative Calculations
	public static int iterativeFibonacci(int n) {
		long calculationTime = System.nanoTime();
		System.out.println("Iterative calculation start time: " + calculationTime);
		
		if(n < 2) {
			return n;
		}
		int currentFib = 1;
		int previousFib = 1;
		
		for(int i = 2; i<n;i++) {
			int tempStore = currentFib;
			currentFib += previousFib;
			previousFib = tempStore;
			
		}
		System.out.println("Iterative calculation end time: " + calculationTime);
		return currentFib;
	}
	
}
	
