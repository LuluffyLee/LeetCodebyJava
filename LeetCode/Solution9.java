//LeetCode
//9. Palindrome Number
public class Solution9{
	//Sublime Run
	public static void main(String[] args)
	{
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    //System.out.println(rev);
	    return (x==rev || x==rev/10);
    }
}