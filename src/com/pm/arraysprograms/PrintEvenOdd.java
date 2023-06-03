package com.pm.arraysprograms;

public class PrintEvenOdd 
{
	public static void print(int[] n)
	{
		
		for(int i=0;i<=n.length-1;i++)
		{
			if(n[i]%2==0&&n[i]!=0)
			{
				System.out.print(n[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<=n.length-1;i++)
		{
			if(n[i]%2!=0&&n[i]!=0)
			{
				System.out.print(n[i]+" ");
			}
		}
		
	}
public static void main(String[] args)
{
	int a [] = {1,2,3,4,5,6};
	print(a);
}
}
