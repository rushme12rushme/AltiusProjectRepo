package qsp;

public class OracleRemoveVowels {

	public static void main(String[] args) {
String str="abcde";
//remove Vowels
String str1=str.replaceAll("[aeiou]", "");
System.out.println(str1);
//Balanced Brackets
String str2="[{()}";
String h="hello";
System.out.println(h.contains("hl"));
//System.out.println(str2.contains("()"));
while (str2.contains("()") || str2.contains("[]") || str2.contains("{}")) {
	str2 = str2.replaceAll("\\(\\)", "")
      .replaceAll("\\[\\]", "")
      .replaceAll("\\{\\}", "");
}
System.out.println(str2);
	}
}
