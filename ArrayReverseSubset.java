package javaarrays;

import java.lang.StringBuffer;
import java.util.*;

public class ArrayReverseSubset
{
	public static void main(String[] args)
	{
		int[] a = new int[]{1,2,3,4,5,6,7,8,9};
		int n = 3;
		ArrayList<Integer> al = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<a.length;i+=3)
		{
			for(int j=i;j<i+n;j++)
			{
				sb.insert(sb.length(),a[j]);		
			}				
		}	
		System.out.println(sb.reverse());
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
	}
}