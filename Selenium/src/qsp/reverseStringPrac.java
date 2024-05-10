package qsp;

public class reverseStringPrac {

	public static void main(String[] args) {
String s="abc";
String rev="";
char [] ch=s.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
	rev=rev+ch[i];
}
System.out.println(rev);
	}
}
