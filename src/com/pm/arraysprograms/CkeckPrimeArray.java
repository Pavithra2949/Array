package com.pm.arraysprograms;

public class CkeckPrimeArray 
{
	public static void check(int[] n)
	{
		int c=0;
		for(int i=0; i<=n.length-1;i++)
		{
		for(int j=2;j<=n[i]-1;j++)
		{
			if(n[i]%j==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.print(n[i]+" ");
		}
		}
	}
public static void main(String[] args) 
{
	int a [] = {1,2,3,4,5,6};
	check(a);
}
}
