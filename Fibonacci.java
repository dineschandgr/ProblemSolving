
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fibonacci(3));
		//System.out.println(fibonacciRecursion(2));
		int n = 3;
		for(int i = 0;i < 9;i++){
			System.out.println(fibonacciRecursion(i));
		}
	}
	
	public static int fibonacci(int n){
		if(n <= 1)
			return n;
		int prev = 0;
		int next = 1;
		int sum = 0;
		for(int i = 2; i <= n; i++){
			sum = prev + next;
			prev = next;
			next = sum;
		}
		return sum;
	}
	
	public static int fibonacciRecursion(int n){
		if(n <= 1)
			return n;
		
		return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
	}
}
