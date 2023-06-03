package com.pm.arraysprograms;

public class Copy 
{
	public static int[] copy(int [] a)	
	{
		int res [] = new int [a.length];
		for(int i=0;i<=res.length-1;i++)
		{
			res[i]=a[i];
		}
//		for(int i=0;i<=res.length-1;i++)
//		{
//			System.out.print(res[i]+" ");
//		}
		return res;
 	}
public static void main(String[] args) 
{
	int a [] = {1,2,3,4,5,6};
//	copy(a);
	int res[] = copy(a);
	for(int i=0;i<=res.length-1;i++)
	{
		System.out.print(res[i]+" ");
	}
}
}
