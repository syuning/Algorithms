package main.java.nowcoder.huawei;

public class HJ50 {
    /* 功能：四则运算
     * 输入：strExpression：字符串格式的算术表达式，如: "3+2*{1+2*[-4/(8-6)+7]}"
     * 返回：算术表达式的计算结果
     */
    public static int calculate(String strExpression)
    {
        /* 请实现*/
        int result = 0;
        for (int i = 0; i <strExpression.length() - 1; i++){

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate("3+2*{1+2*[-4/(8-6)+7]}"));
    }
}
