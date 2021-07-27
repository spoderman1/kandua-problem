using System;
using static System.Diagnostics.Debug;

namespace BalancedParens
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Assert(ParensAreBalanced("()"));
            Assert(ParensAreBalanced("[]"));
            Assert(ParensAreBalanced("(") == false);
            Assert(ParensAreBalanced("]") == false);
            Assert(ParensAreBalanced("}") == false);


            Assert(ParensAreBalanced("((()))"));
            Assert(ParensAreBalanced("((())") == false);
            Assert(ParensAreBalanced("][[[[[[") == false);

            Assert(ParensAreBalanced("{([])}"));
            Assert(ParensAreBalanced("{([]}") == false);

            Assert(ParensAreBalanced(""));
            Assert(ParensAreBalanced("hello world"));

            Assert(ParensAreBalanced("function () { console.log([\"cat\", \"dog\"]) }"));
            Assert(ParensAreBalanced("function ( { console.log([\"cat\", \"dog\"]) }") == false);
            Assert(ParensAreBalanced("([)]") == false);

            Console.WriteLine("Done!");
        }


        public static bool ParensAreBalanced(string input)
        {
            int stringLen = input.Length;
            string parens = "";

            for (int n = 0; n < input.Length; n++)
            {
                if (input[n] == '{' || input[n] == '(' || input[n] == '[' || input[n] == ']' || input[n] == ')' || input[n] == '}')
                    parens = parens + input[n];
            }
            if (parens == "")
                return true;
            int parensSize = parens.Length;
            int m = parensSize;
            if (parensSize % 2 != 0)
                return false;

            for (int n = 0; n < parensSize / 2; n++)
            {
                char pairBracket = ' ';
                if (parens[n] == '{')
                    pairBracket = '}';
                if (parens[n] == '(')
                    pairBracket = ')';
                if (parens[n] == '[')
                    pairBracket = ']';
                if (pairBracket != parens[m - 1] && pairBracket != parens[n + 1])
                    return false;
                if (parens[n + 1] == pairBracket)
                { n++; }
                else
                { m--; }
            }
            return true;
        }
    }
}