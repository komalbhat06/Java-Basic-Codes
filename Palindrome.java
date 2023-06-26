
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=787;
		int number=a;
		int rev=0;
		while(a>0) {
			int lastdigit=a%10;
			rev=rev*10 +lastdigit;
			a=a/10;
		}
if(rev==number) {
	System.out.println("It is a palindrome number");
}
else {
	System.out.println("It is not a palindrome number");
}
	}

}
