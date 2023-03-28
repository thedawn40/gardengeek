package demo.function;


public class Palindrom {

	public String longestNonPalindromeSubstring(String s){
		String result = "";

	    boolean palindrom = false;
	    String temp = "";
	    int len = s.length();
	    for(int i = len-1; i >= 0; i--) {
	    	temp = temp +String.valueOf(s.charAt(i));
	    }
	    if(s.equalsIgnoreCase(temp)) {
	    	palindrom = true;
	    }
    	if(palindrom) {
    		result = s.substring(0, s.length()-1);
    	}else {
    	    result = s;
    	}
		
		return result;
    }
}
