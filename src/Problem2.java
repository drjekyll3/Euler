public class Problem2 {
	/***
	 * http://projecteuler.net/problem=2
	 * @param n
	 * @return The sum of even-valued terms of values that do not exceed n.
	 */
	public static int sumEven(int n) {
		return sumEven(n, 1, 2);
	}
	
	/***
	 * Helper function
	 * @param n
	 * @param current The current value in the Fibonacci sequence
	 * @param next The next value in the Fibonacci sequence
	 * @return the sum of even-valued terms of values that do not exceed n.
	 */
	private static int sumEven(int n, int current, int next) {
		if (current > n) {
			return 0;
		}
		
		if (current % 2 == 0) {
			return current + sumEven(n, next, current + next);
		} else {
			return sumEven(n, next, current + next);
		}
	}
	
	/***
	 * Generate the Fibonacci sequence not exceeding n.
	 * @param n
	 * @return The fibonacci sequence.
	 */
	public static String generateFibonacci(int n) {
		return generateFibonacci(n, 1, 2);	
	}
	
	/***
	 * Helper function that generates the Fibonacci sequence.
	 * @param n
	 * @param current The current value in the Fibonacci sequence.
	 * @param next The next value in the Fibonacci sequence.
	 * @return The Fibonacci sequence.
	 */
	private static String generateFibonacci(int n, int current, int next) {
		StringBuilder fibs = new StringBuilder();
		if (current > n) {
			return fibs.toString();
		}
		fibs.append(current + " ");
		return fibs.toString() + generateFibonacci(n, next, current + next);
	}
	
	public static void main(String[] args) {
		System.out.println(Problem2.generateFibonacci(4000000));
		System.out.println(Problem2.sumEven(4000000));
	}
}
