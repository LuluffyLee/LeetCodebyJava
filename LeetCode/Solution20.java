//LeetCode
//20. Valid Parentheses
import java.util.*;

public class Solution20{
	//Sublime Run
	public static void main(String[] args)
	{
		System.out.println(isValid("([)]"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}