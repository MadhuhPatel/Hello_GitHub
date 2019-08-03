package com.apex.qasamples;

public class FindMissingNumberInArray {
	
	public static void main(String[] args)
	{
		int a[]= {1,2,4,5,6,7,8,9 };
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i< a.length -1; i++)
		{
			sum1=sum1+a[i];
		}
		for (int i = 1; i <= a.length; i++)
		{
			sum2 = sum2+i;
		}
		
		System.out.println("The missing number is " + (sum2-sum1));
	}

}
 