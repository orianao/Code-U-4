public class StringPalindrome {

	private static void longestPalindrome(char s[]) {
		int stringLength = s.length;
		int palindromeLength[]=new int[stringLength];
		for(int i=stringLength-1; i>=0;i--){
			if((s[i+1]==0 && s[i+1]!=s[i]) || i==stringLength-1){
				palindromeLength[i]=0;
			}
			else if (s[i+1]==0 && s[i+1]==s[i]){
				palindromeLength[i]=1;
			}
			else if(s[i+1]!=0 && s[i+1+palindromeLength[i+1]+1]==s[i]){
				palindromeLength[i]=palindromeLength[i+1]+2;
			}
		}
	}

	public static void main(String[] args) {
		String s;
		longestPalindrome(s);
	}
}
