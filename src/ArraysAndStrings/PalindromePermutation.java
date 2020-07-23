package ArraysAndStrings;

public class PalindromePermutation {
	public boolean isPermutationOfPalindrome(String str) {
		int [] table = buildCharFrequencyTable(str);
		return checkMaxOneOdd(table);
	}
	 int[] buildCharFrequencyTable(String str) {
		 int [] table = new int[Character.getNumericValue('z') -
		                        Character.getNumericValue('a') +1];
		 for(char c : str.toCharArray()) {
			 int x = getCharNumber(c);
			 if(x != -1)
				 table[x] ++;
		 }		 
		 return table;
	 }
	 
	 public int getCharNumber(char c) {
		 int a = Character.getNumericValue('a');
		 int z = Character.getNumericValue('z');
		 int value = Character.getNumericValue(c);
		 if(a <= value && value <= z){
			 return value - a;
		 }
		 return -1;
	 }
	public boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for(int count : table) {
			if(count %2 ==1) {
				if(foundOdd)
					return false;
				foundOdd = true;
			}
		}
		return true;
	}
	 
	public boolean isPermutationOfPalindrome2(String str) {
		int count = 0;
		int [] table = new int[Character.getNumericValue('z') -
		                       Character.getNumericValue('a') + 1	];
		for(char c: str.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
				if(table[x] %2 == 1)
					count++;
				else
					count--;
			}
		}		
		return count <= 1;
	}
}
