package com.pm.arraysprograms;

public class CountEvenOdd
{
	public static void count(int[] n)
	{
		int c=0,c1=0;
		for(int i=0;i<=n.length-1;i++)
		{
		   if(n[i]%2==0&&n[i]!=0)
		   {
			   c++;
		   }
		   else
		   {
			  if(n[i]%2==1&&n[i]!=0)
			   c1++;
		   }
		}
		System.out.println("the even counts are :"+c);
		System.out.println("the odd counts are :"+c1);
	}
  public static void main(String[] args)
{
	int a[] = {1,2,3,4,0,5,6,7,8,9,10,11,0};
	count(a);
}
}
