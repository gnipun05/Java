package Stack;
import java.util.*;

public class _5_BalancedParenthesis {

    public static boolean isBalanced(String str){
        Deque<Character> s = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++){
            char b = str.charAt(i);
            if (b=='['|| b=='{' || b=='(')
                s.push(b);
            else{
                if(s.isEmpty())
                   return false;
                char a = s.peek();
                if(!isMatching(a,b))
                    return false;
                else
                    s.pop();
            }
        }
        return (s.isEmpty());
    }

    public static boolean isMatching(char A, char B){
        return ((A=='['&& B==']')||(A=='{'&& B=='}')||(A=='('&& B==')'));
    }

    public static void main(String args[]){
        String str = "[{{([{}])}}]";
        // String str = "[{{}}]))([])";
        System.out.println(isBalanced(str));
    }
}