package leetcode;

import java.util.Scanner;

public class reverseint {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		
	}
	public int reverse(int x) {
		//flag marks if x is negative
		boolean flag = false;
		if (x < 0) {
			x = 0 - x;
			flag = true;
		}
	 
		long res = 0;
		long p = x;
	 
		while (p > 0) {
			long mod = p % 10;
			p = p / 10;
			res = res * 10 + mod;
		}
	 
		if (flag) {
			res = 0 - res;
		}
	 
		return res;
	}
}
