public class Problem1 {
	/***
	 * http://projecteuler.net/problem=1
	 * @param n
	 * @return sum of all the multiples of 3 or 5 below 1000.
	 */
	public static int sumMultiplesOf3and5(int n) {
		return sumMultiplesOf3and5(n, 1);
	}
	
	/***
	 * Helper function
	 * @param n
	 * @param current
	 * @return sum of all the multiples of 3 or 5 below 1000.
	 */
	public static int sumMultiplesOf3and5(int n, int current) {
		if (current == n) {
			return 0;
		}
		
		if (current % 3 == 0 || current % 5 == 0) {
			return current + sumMultiplesOf3and5(n, current + 1);
		}
		return sumMultiplesOf3and5(n, current + 1);
	}
	
	public static void main(String[] args) {
		System.out.println(Problem1.sumMultiplesOf3and5(1000));
	}
}
