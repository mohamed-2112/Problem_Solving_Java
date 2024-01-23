import java.util.Stack;
public class ValidParentheses {

    public boolean validParen(String s){
        Stack<String> theStack = new Stack<>();

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                theStack.push(String.valueOf(s.charAt(i)));
            }else if(s.charAt(i)==')' && !theStack.isEmpty() && theStack.peek().equals("(")){
                    theStack.pop();
            } else if (s.charAt(i)=='}' && !theStack.isEmpty() && theStack.peek().equals("{")) {
                    theStack.pop();
            } else if (s.charAt(i)==']' && !theStack.isEmpty() && theStack.peek().equals("[")) {
                    theStack.pop();
            }else{
                return false;
            }
        }

        return theStack.isEmpty();

    }
}
