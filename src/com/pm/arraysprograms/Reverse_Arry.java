package com.pm.arraysprograms;

public class Reverse_Arry
{
	public static int[] reve(int [] a)
	{
		int res[] = new int [a.length];
	  for(int i= 0;i<=res.length-1;i++)
	  {
		 res[i]=a[i];
	  }
	  return res;
	}
public static void main(String[] args)
{
	int a [] = {1,2,3,4,5,6};
	int res[]=reve(a);
	for(int i= res.length-1; i>=0; i--)
	{
		System.out.print(res[i]+" ");
	}	
}
}
