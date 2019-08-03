package com.apex.qasamples;

import java.util.Arrays;

public class AnagramSimple {
	
	public static void main (String[] str) {
		
		String str1 = "Anger";
		String str2 = "Range";
		System.out.println(" Given strings are anagram? "+ anagramCheck(str1, str2));
		
		
	}
	public static boolean anagramCheck (String str1, String str2 )
	
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);
		return Arrays.equals(str1Arr, str2Arr);
	}

}
