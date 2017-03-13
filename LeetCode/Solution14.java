//LeetCode
//14. Longest Common Prefix
import java.util.*;

public class Solution14{
	//Sublime Run
	public static void main(String[] args)
	{
		String[] strs={"1234gsdgrewget34","uasdnauis","12345eawd"};
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		int maxIndex=0;
		String longestCommonStr="";
		if(strs.length==0)
			{
				return longestCommonStr;
			}
        for(int k=0;k<strs[0].length();k++) {
        	int i=0;
        	for(;i<strs.length&&strs[i].length()>k;i++)
        	{
        		if(strs[i].charAt(k)!=strs[0].charAt(k))
        			return longestCommonStr;
        	}
        	if(i==strs.length){longestCommonStr=strs[0].substring(0,k+1);}
        }
        return longestCommonStr;
    }
}