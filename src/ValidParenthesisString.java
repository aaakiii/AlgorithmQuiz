/**
 * Created by AKI on 2017-10-30.
 */

//Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:

// 1.Any left parenthesis '(' must have a corresponding right parenthesis ')'.
// 2.Any right parenthesis ')' must have a corresponding left parenthesis '('.
// 3.Left parenthesis '(' must go before the corresponding right parenthesis ')'.
// 4.'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
// 5.An empty string is also valid.

public class ValidParenthesisString {

    public static void main(String[] args) {
        System.out.println(checkParenthesis("(**))"));
    }

    public static boolean checkParenthesis(String input){
        int min = 0;
        int max = 0;
        for(char chr: input.toCharArray()){
            if(chr == '('){
                min++;
                max++;
            }else if(chr == ')'){
                if(min > 0){
                    min--;
                }
                max--;
            }else {
                if(min > 0){
                    min--;
                }
                max++;
            }

            if(max < 0){
                return false;
            }
        }
        return min == 0;
    }
}
