package leetcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class SingleNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[] {1,1,2,2,3,4,4};
		System.out.println(singleNumber(arr));
		System.out.print(7^6);
		
		
	}
	 public static int singleNumber(int[] nums) {
		 Hashtable map=new Hashtable<Integer,Integer>();
		 for (int i=0;i<nums.length;i++) {
			 map.put( nums[i],i);
		 }
		 int result = nums[0];
	        for (int i = 1; i < nums.length; ++i) {
	            result ^= nums[i];
	        }
	        return result;
		 
				 
		 
		 
	    }
}