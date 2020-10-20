import java.util.HashSet;
import java.util.Set;


public class LongestSubStringWithContiguous {
	public static void main(String[] args) {
		System.out.println(LongestSubString("geeksforgeeeks"));
	}
	
	public static int LongestSubString(String str){
		int maxCount = 0;
		if(str == null)
			return 0;
		str = str.toLowerCase();
		Set<Character> set = new HashSet<Character>();
		int startWindow = 0;
		for(int endWindow = 0; endWindow < str.length(); endWindow++){
			char ch = str.charAt(endWindow);
			if(!set.contains(ch)){
				set.clear();
				set.add(ch);
				startWindow = endWindow;
			}
			maxCount = Math.max(maxCount,endWindow - startWindow + 1);	
			
		}
		return maxCount;
	}
}
