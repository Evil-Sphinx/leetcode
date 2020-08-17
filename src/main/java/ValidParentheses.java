import java.util.Stack;

/**
 * @author sphinx
 * @date 2020/8/17
 * @description
 */
public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;

                case ')':
                    if (stack.empty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') return false;
                    break;
            }
        }

        return stack.empty();
    }


    public static void main(String[] args) {


        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("{[]}"));

    }


}
