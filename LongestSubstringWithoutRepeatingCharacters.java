package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(lengthOfLongestSubstring(s));
		
			
	}
	public static int lengthOfLongestSubstring(String s) {
		int len = s.length();
		int i = 0;
		int j = 0;
		boolean[] visited = new boolean[256];
		int maxLen = 0;
		while (j < len){
			if (visited[s.charAt(j)]){//if already visited
				maxLen = Math.max(maxLen, j-i);
				while (s.charAt(i) != s.charAt(j)){
					visited[s.charAt(i)] = false;
					i++;
				}
				i++;
			}
			else{//if not visited
				visited[s.charAt(j)] = true;
			}
			j++;
		}
		maxLen = Math.max(maxLen, len - i);
		return maxLen;        
    }
}
