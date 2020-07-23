package ArraysAndStrings;

import java.util.Arrays;

public class isUnique {
	public boolean isUniqueChars(String str) {
		if(str.length() > 128)
			return false;
		boolean[] chars = new boolean [128];
		for(int c : str.toCharArray()){
			if(chars[c])
				return false;
			chars[c] = true;
		}
		return true;
	}
	
	public boolean isUniqueCharsBrutForce(String str) {
		int n= str.length();
		for(int i = 0; i < n; i ++) {
			for(int j= i; j < n; j++) {
				if(str.charAt(i) == str.charAt(j))
					return false;				
			}
		}
		return true;
	}
	
	public boolean isUniqueCharsSortin(String str) {
		char[] chars = str.toCharArray();
		Arrays.parallelSort(chars);
		for(int i = 0; i < str.length()-1; i++) {
			if(chars[i] == chars[i+1])
				return false;
		}
		return true;
	}
}
