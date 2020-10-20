
public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(0));
		System.out.println("factorialRecursion is "+factorialRecursion(0));
	}
	
	public static int factorial(int n){
		if(n==0 || n==1)
			return 1;
		int factorial = 1;
		for(int i = 1; i <= n; i++){
			factorial = factorial * i;
		}
		
		return factorial;
	}
	
	public static int factorialRecursion(int n){
		if(n==0 || n==1)
			return 1;
		
		return n * factorialRecursion(n-1);
			
	}
}
