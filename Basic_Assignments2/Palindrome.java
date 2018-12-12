package Basic_Assignments2;

public class Palindrome {

	public boolean checkPalindrome(int number) {
		int temporaryVariable=number;
		int sum=0;
		if(number>=10)
		{
			while(number!=0)
			{
				int remainder=number%10;
				sum=sum*10+remainder;
				number=number/10;
			}
			return sum == temporaryVariable;
		}
		return false;
		
	}

}
