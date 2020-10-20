
public class MostRepeatedWord {
	public static void main(String[] args) {
		char ch = mostRepeatedWord("heelo");
		System.out.println(Character.toString(ch));
	}
	
	public static char mostRepeatedWord(String str){
		int[] repeatArr = new int[128];
		int maxCount = 0;
		char mostRepeatingChar = 0;
		for(char ch : str.toCharArray())
			repeatArr[ch]++;
		
		for(int i = 0; i < repeatArr.length; i++){
			if(repeatArr[i] > maxCount){
				maxCount = repeatArr[i];
				mostRepeatingChar = (char)i;
			}
		}
		System.out.println(maxCount);
		return mostRepeatingChar;
		
	}
}
