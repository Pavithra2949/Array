package com.pm.arraysprograms;

public class Prgrm3 
{
public static void test(int n[])
{
	int c=0, c1=0;
	for(int i=0;i<n.length;i++)
	{
		if(n[i]%2==0&&n[i]!=0)
		{
			System.out.println("the even num are , "+n[i]);
			c++;
		}
		else
		{
			c1++;
		}
	}
	System.out.println("total count of even num is "+c);
	System.out.println("total count of odd num is "+ c1);
}
public static void main(String[] args)
{
	int a []= {0,1,2,3,4,5,6,7,0};
	test(a);
}
}
