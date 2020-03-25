package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print(removeDuplicates(arr));
		  
	}
	 public static int removeDuplicates(int[] nums) {
		 Set set = new HashSet<Integer>();
		 for(int i=0; i<nums.length;i++) {
	            set.add(nums[i]);   
	        }
		 nums=null;
		 
		 Integer[] array = new Integer[hashSet.size()];
	      //Converting Set object to integer array
	      int j = 0;
	      for(int i=0; i<set.size();i++) {
	            nums[i]=set.toArray()   
	        }
		 System.out.print(set);
		return set.size();
	        
	    }

}
