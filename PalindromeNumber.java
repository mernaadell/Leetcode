package leetcode;

public class PalindromeNumber {
	   public boolean isPalindrome(int x) {
	        String s=Integer.toString(x);
	        for(int i=0;i<s.length()-1;i++){
	            if(s.charAt(i)!=s.charAt(s.length()-i-1))
	                return false;
	        }
	        return true;
	        
	    }

}
