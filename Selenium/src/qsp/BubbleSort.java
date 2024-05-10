package qsp;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	 System.out.println("Enter the size of the array");
	 Scanner sc=new Scanner(System.in);
	 int size=sc.nextInt();
	 int []a=new int[size];
	 System.out.println("Enter the elements of the array");
	 
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
