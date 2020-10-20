import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class PrimeNumber {

	public static void main(String[] args) {
		
		List<Integer> primeNumList = new LinkedList<>();
		IntStream.range(2, 100).forEach( i -> {
				if(isPrime(i))
					primeNumList.add(i);
				
			}
		);
		
		System.out.println("distinct "+primeNumList.stream().distinct().count());
		primeNumList.forEach(System.out::println);
	}	

	private static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n);i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
