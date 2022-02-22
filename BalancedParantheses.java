import java.util.Scanner;
import java.util.Stack;

public class BalancedParantheses {
	public static boolean isBalancedParentheses(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0;i<str.length();i++){
			char x = str.charAt(i); 
			if(x == '[' ||x == '{' || x == '(') {
				stack.push(str.charAt(i));
				continue;
			}
			if(stack.isEmpty())
				return false;
			char check = stack.pop();
			switch(x) {
			case ')':
				if(check == '{' || check == '[')
					return false;
				break;
			case '}':
				if(check == '(' || check == '[')
					return false;
				break;
			case ']':
				if(check == '{' || check == '(')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(); //Enter number of test cases
		while(t>0) {
		String str = s.next(); //enter string to check
		boolean result = isBalancedParentheses(str);
		if(result)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		}
		t--;
	}

}
