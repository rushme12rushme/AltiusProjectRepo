package qsp;

public class StringFrequency {

	public static void main(String[] args) {
		String [] s= {"apple","apple","mango","banana","mango"};
		boolean []b=new boolean[s.length];


		for(int i=0;i<s.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				{
					for(int j=i+1;j<s.length;j++)
					{
						if(s[j]==s[i])
						{
							count++;
							b[j]=true;
						}
					}

				}
				if(count>1)
				{
					System.out.println(s[i]);
				}
			}
		}
	}
}
