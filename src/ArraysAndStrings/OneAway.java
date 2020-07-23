package ArraysAndStrings;

public class OneAway {
	public boolean oneEditAway(String first, String second) {
		if(first.length() == second.length())
			return oneEditReplace(first, second);
		else if(first.length() + 1 == second.length())
			return oneEditInsert(first, second);
		else if(first.length()-1 == second.length())
			return oneEditInsert(second, first);
		return false;
	}
	
	public boolean oneEditReplace(String s1, String s2) {
		boolean isDiferenceFounded = false;
		for(int i = 0; i< s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(isDiferenceFounded)
					return false;
				isDiferenceFounded = true;
			}
			
		}
		return true;
	}
	
	public boolean oneEditInsert(String s1, String s2) {
		int index1 = 0, index2 = 0;
		while(index1< s1.length() && index2< s2.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(index1 != index2)
					return false;
				index2++;
			}
			else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	
	public boolean oneEditAway2(String first, String second) {
		if(first.length() - second.length() > 1)
			return false;
		String s1 = first.length() < second.length() ? first: second;
		String s2 = second.length() < second.length()? second: first;
		int index1 = 0, index2 = 0;
		boolean isDiferenceFounded = false;
		while(index1 < s1.length() && index2 < s2.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {				
				if(isDiferenceFounded)
					return false;
				isDiferenceFounded = true;
				if(s1.length() == s2.length())
					index1++;
			}
			else {
				index1++;
			}
			index2++;
		}
		return true;		
	}
		
}
