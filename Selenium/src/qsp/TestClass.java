package qsp;
//{}}}[]()))
// {[(])[

public class TestClass {

	public static void main(String[] args) {
		String str="[]{(}";
		if (str.contains("()") || str.contains("[]") || str.contains("{}")) {
		    str = str.replaceAll("\\(\\)", "")
		      .replaceAll("\\[\\]", "")
		      .replaceAll("\\{\\}", "");
		}
		System.out.println(str);

		System.out.println(str.length());
		
	}
}


