package p2.fib;

public class Fibonacci {

	
	public static void fib (int fibSeq) {
		
		int total = 0;
		int previous = 0;
		int current = 1;
		
		while (previous < 100) {
			
			total = previous + current;
			previous = current;
			current = total;
			
			
			System.out.println(total);
		}
		
		
		
		
	}
	public static void main(String[] args) {

		Fibonacci.fib(100);
	}

}
