package ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {
	public boolean isPermutation(String s, String t) {
		if(s.length() != t.length())
			return false;
		return s.equals(t);
	}
	
	public String sortString(String str) {
		char [] s = str.toCharArray();
		Arrays.parallelSort(s);
		return new String(s);
	}
	public boolean permutation(String s, String t) {
		if(s.length() != t.length()) 
			return false;
		int[] letters = new int[128];
		for(char c: s.toCharArray())
			letters[c]++;
		
		for(char c: t.toCharArray()) {
			letters[c]--;
			if(letters[c] < 0)
				return false;
		}
		return true;
	}
	
	public static void main(String [] args) {
		CheckPermutation solution = new CheckPermutation();
		String s = "hello world";
		String t = "world hello";
		boolean result = solution.permutation(s, t);
		System.out.println(s+ " es permutacion de "+t+"? \nRespuesta: "+result);
	}
}
