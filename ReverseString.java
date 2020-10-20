import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		String str = "madam";
		System.out.println(reverseString(str));
	}
	
	public static String reverseString(String str){
		char[] strArr = str.toCharArray();
		int length = strArr.length;
		
		for(int i = 0; i < length/2; i++){
			char temp = strArr[i];
			strArr[i] = strArr[length - i - 1];
			strArr[length - i - 1] = temp;
		}
		
		return Arrays.toString(strArr);
		
	}
}
