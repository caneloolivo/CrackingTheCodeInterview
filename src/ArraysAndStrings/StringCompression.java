package ArraysAndStrings;

public class StringCompression {
	public String compressBad(String str) {
		String result = "";
		int count = 0;
		for(int i= 0; i < str.length(); i++) {
			count ++;
			if(i +1 >= str.length() || (str.charAt(i) != str.charAt(i +1))) {
				result += "" + str.charAt(i)+ count;
				count = 0;
			}
		}
		return result.length() < str.length()? result: str;
	}
	
	public String compress(String str) {
		StringBuilder result = new StringBuilder();
		int count = 0;
		for(int i =0; i<str.length(); i++) {
			count++;
			if(i+1 <str.length() || str.charAt(i) != str.charAt(i+1)) {
				result.append(str.charAt(i));
				result.append(count);
				count = 0;
			}
		}
		return result.length()< str.length()? result.toString(): str;
	}
}
