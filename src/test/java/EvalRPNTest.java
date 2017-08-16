/**
 * Created by 小易 on 2017/8/16.
 */
public class EvalRPNTest {

    public static void main(String[] args) {
        String [] token = new String[]{"8", "2", "3", "+", "*"};
        EvaluateReversePolishNotation evalRPN = new EvaluateReversePolishNotation();
        System.out.println(evalRPN.evalRPN(token));
    }
}
