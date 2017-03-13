//LeetCode
//28. Implement strStr()
import java.util.*;

public class Solution28{
	//Sublime Run
	public static void main(String[] args)
	{
		System.out.println(strStr2("a",""));
	}

    //runtime ex
	public static int strStr(String haystack, String needle) {
        if(haystack.isEmpty()&&needle.isEmpty()) {return 0;}
        else if(!haystack.isEmpty()&&needle.isEmpty()) {return 0;}
        else if(needle.isEmpty()){return -1;}
        int index=-1;
        for(int i=0;i<haystack.length();i++)
        {
        	int j=0;
        	for(;j<haystack.length()-i&&j<needle.length();j++)
        	{
        		if(needle.charAt(j)==haystack.charAt(i+j))
        		{
        			//System.out.println(i+","+j);
        			continue;
        		}else
        		{
        			break;
        		}
        	}
        	if(j==needle.length()) 
        	{
        	    index=i;
        	    break;
        	}
        }        
        return index;
    }

    public static int strStr2(String haystack, String needle) {
        for (int i = 0; ; i++) {
    	for (int j = 0; ; j++) {
     	if (j == needle.length()) return i;
     	if (i + j == haystack.length()) return -1;
      	if (needle.charAt(j) != haystack.charAt(i + j)) break;
    }
  }
    }
}