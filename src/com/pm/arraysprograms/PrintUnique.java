package com.pm.arraysprograms;

public class PrintUnique 
{
	public static void check(int n [])
	{
		for(int i=0;i<n.length;i++)
		{
			int c=0;
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					c++;
					n[j]=-1;
				}
			}
			if( n[i]!=-1 && c>0)
			{
				System.out.print(n[i]+" ");
			}
		}
	}
public static void main(String[] args) 
{
	int n [] = { 1,7,2,1,3,1,8,2,7,9,5,4,9};
	check(n);
}
}
