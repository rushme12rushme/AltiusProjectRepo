package qsp;

public class reversePrac {

	public static void main(String[] args) {
		String s="abcd3456";
		char[] ch=s.toCharArray();int sum=0;


		for(int i=0;i<ch.length;i++)
		{


			Character c = Character.valueOf(ch[i]);
			boolean b=Character.isDigit(c);
			
			if(b==true)
			{
				int num=Character.getNumericValue(c);
				sum=sum+num;
			}
		}
		System.out.println(sum);
		System.out.println(Character.getNumericValue('A'));
	}




}
