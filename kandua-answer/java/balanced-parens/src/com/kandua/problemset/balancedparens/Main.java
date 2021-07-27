package com.kandua.problemset.balancedparens;

@SuppressWarnings("PointlessBooleanExpression")
public class Main {

    public static void main(String[] args) {
        assert ParensAreBalanced("()") == true;
        assert ParensAreBalanced("[]") == true;
        assert ParensAreBalanced("(") == false;
        assert ParensAreBalanced("]") == false;
        assert ParensAreBalanced("}") == false;

        assert ParensAreBalanced("((()))") == true;
        assert ParensAreBalanced("((())") == false;
        assert ParensAreBalanced("][[[[[[") == false;

        assert ParensAreBalanced("{([])}") == true;
        assert ParensAreBalanced("{([]}") == false;

        assert ParensAreBalanced("") == true;
        assert ParensAreBalanced("hello world") == true;

        assert ParensAreBalanced("function () { console.log(['cat', 'dog']) }") == true;
        assert ParensAreBalanced("function ( { console.log(['cat', 'dog']) }") == false;
        assert ParensAreBalanced("([)]") == false;

        System.out.println("Hello World!");
    }

    private static boolean ParensAreBalanced(String input) {
        return false;
    }
}