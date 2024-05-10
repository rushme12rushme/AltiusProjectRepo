package qsp;

public class NthLargetPrac {

	public static void main(String[] args) {
		int n=3;
		int []a= {10,20,30,40,50};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
		  {
			 if(a[j]>a[i]) 
			 {
				 count++;
			 }
		  }
		  if(count==n-1)
		  {
			System.out.println(a[i]);
			break;
		  }
		}
		
	}

}
