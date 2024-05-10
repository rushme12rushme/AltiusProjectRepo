package qsp;

public class TyStringSum {

		public static void main(String[] args) {
			String s="abcd3456";
			char[] ch=s.toCharArray();int sum=0;


			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='0' && ch[i]<='9')
				{
					sum=sum+Character.getNumericValue(ch[i]);
				}
			}
			System.out.println(sum);
	}

}
