//LeetCode
//7. Reverse Integer
public class Solution7{
	//Sublime Run
	public static void main(String[] args)
	{
		System.out.println(reverse(153423646));
	}

	public static int reverse(int x) {
		if (x>Integer.MAX_VALUE||x<Integer.MIN_VALUE)
		{
			return 0;
		}
        else if(x<0)
        {
        	x=-x;
        	return -change(x);
        }
        else 
        	return change(x);
    }

	public static int change(int x) {
		int reverseNum=0;
		int newNum=0;
		while(x!=0){			
			newNum=reverseNum*10+x%10;
			if(reverseNum!=newNum/10){return 0;}
			reverseNum=newNum;
			x=x/10;			
		}
		return reverseNum;
	}
}