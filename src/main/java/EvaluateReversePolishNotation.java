import java.util.Stack;

/**
 * Created by 小易 on 2017/8/16.
 * 计算逆波兰表达式
 */
public class EvaluateReversePolishNotation {

    //计算
    public int evalRPN(String [] tokens){
        int result = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();
        for(String t : tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (t){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
        result = Integer.valueOf(stack.pop());
        return result;
    }
}
