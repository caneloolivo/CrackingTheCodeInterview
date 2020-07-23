package ArraysAndStrings;

public class StringRotation {
	public boolean isRotation(String s1, String s2) {
		int len = s1.length();
		if(s2.length() == len && len >0) {
			String s1s1 = s1+s1;
			return isSubString(s1s1, s2);					
		}
		return false;		
	}
	
	public boolean isSubString (String s1s1, String s2){
		String subString = s1s1.substring(s1s1.indexOf(s2));
		return subString.equals(s2);
	}
}
