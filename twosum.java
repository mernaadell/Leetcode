package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class twosum {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr2[]=twoSum(arr,t);
		System.out.print(arr2[0]+" "+arr2[1]);
		  
		
	}
	 public static int[] twoSum(int[] nums, int target) {
		   HashMap<String, Integer> numbers = new HashMap<String, Integer>();
	        
	        for(int i=0; i<nums.length;i++) {
	            numbers.put(Integer.toString(nums[i]),i);   
	        }
	        
	        for(int i=0, place=i; i<nums.length;i++) {    
	            
	            int distance = target - nums[i];
	            
	            if (numbers.containsKey(Integer.toString(distance))) {
	                place = numbers.get(Integer.toString(distance));
	                if (i!=place){
	                    return new int[]{i,place};
	                }  
	            }
	        }
	        
	        return new int[]{0,0};
		 
		 
		 
		
	        
	    }

}
