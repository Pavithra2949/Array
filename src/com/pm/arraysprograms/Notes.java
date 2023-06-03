package com.pm.arraysprograms;

public class Notes 
{
	public static void count(int n[])
	{
		int c=0; int amt=1520;
		for(int i=0; i<9;i++)
		{
			//c=c%n[i];
			c=amt/n[i];
			if(c>0)
			{
				System.out.println(c);
			}
		}
		System.out.println(c);
	}
public static void main(String[] args)
{
	int n [] = {2000,1000,500,200,20,10};
	count(n);
}
}
