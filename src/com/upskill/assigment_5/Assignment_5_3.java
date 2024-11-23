package com.upskill.assigment_5;

public class Assignment_5_3 {
	
//	A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
// 	Write a method that detects if a string is a palindrome.
// 	Tip: Use word.charAt(i) to get the character at position i.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("abcba"));
     
	}
	
	public static boolean checkPalindrome(String s){
		int left = 0;
		int right = s.length() -1;
		
		while(left < right){
			if(s.charAt(left) != s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
