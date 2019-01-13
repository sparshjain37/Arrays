package MAIN;

import java.util.Stack;

public class histogram {

	
	private static int areaOfHist(int[] arr) {
		StackInteger s = new StackInteger();
		int maxArea=0,area=0;
		int i=0;
		while(iarr.length)
		{
			if(s.empty()  arr[i]=arr[s.peek()])
			{
				s.push(i++);
			}
			else
			{
				int tp=s.peek();
				s.pop();
				area=arr[tp](s.empty()ii-tp-1);
				if(areamaxArea)
				{
					maxArea=area;
				}
			}
		}
		while(!s.empty())
		{
			int tp=s.peek();
			s.pop();
			area=arr[tp](s.empty()ii-tp-1);
			if(areamaxArea)
			{
				maxArea=area;
			}
		}
		
			return maxArea;
		
	}
	public static void main(String args[])
	{
		int arr[]= {3,4,2,3,4,5,4,2};
		int res=areaOfHist(arr);
		System.out.println(res);
	}

	
}
