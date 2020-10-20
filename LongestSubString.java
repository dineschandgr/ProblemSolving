import java.util.Arrays;

public class LongestSubString {
	public static void main(String[] args) {
		System.out.println(longestSubString("hama"));
	}
	
	public static int longestSubString(String str){
		int[] lastIndex = new int[256];
		int maxCount = 0;
		int startWindow = 0;
		str = str.toLowerCase();
		
		Arrays.fill(lastIndex,-1);
		for(int endWindow = 0; endWindow < str.length(); endWindow++){
			startWindow = Math.max(startWindow, lastIndex[str.charAt(endWindow)] + 1);
			
			lastIndex[str.charAt(endWindow)] = endWindow;
			
			maxCount = Math.max(maxCount, endWindow - startWindow + 1);
		}
		
		System.out.println(Arrays.toString(lastIndex));
		return maxCount;
				
				
	}
}
