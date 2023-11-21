import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
	
		nonReptingString(s);
	}

	private static void nonReptingString(String s) {
	String res = "";
	for(int i=0;i<s.length();i++) {
		String temp = "";
		for(int j=i;j<s.length();j++) {
			if(temp.indexOf(s.charAt(j))==-1) {
				temp = temp+s.charAt(j);
			}else {
				break;
			}
		}
		if(temp.length()>res.length()) {
			res=temp;
		}
	}
		System.out.println(res);
	}

}
