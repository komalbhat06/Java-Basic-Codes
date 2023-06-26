
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Komal Bhat";
		String lowertext=text.toLowerCase();
		System.out.println("vowels:");
		for(int i=0;i<lowertext.length();i++) {
			char ch=lowertext.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
		}

	}

}
