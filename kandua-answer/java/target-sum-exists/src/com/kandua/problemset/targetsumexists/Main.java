package com.kandua.problemset.targetsumexists;

@SuppressWarnings("PointlessBooleanExpression")
public class Main {

    public static void main(String[] args) {
        assert TargetSumExistsInTwoNumbers(new int[]{10, 20}, 30) == true;
        assert TargetSumExistsInTwoNumbers(new int[]{10, 20}, 35) == false;
        assert TargetSumExistsInTwoNumbers(new int[]{10, 20}, 40) == true;
        assert TargetSumExistsInTwoNumbers(new int[]{-9, 10}, 1) == true;
        assert TargetSumExistsInTwoNumbers(new int[]{10, -8}, 1) == false;
        assert TargetSumExistsInTwoNumbers(new int[]{10, 2, 4, -9, 6}, 1) == true;
        assert TargetSumExistsInTwoNumbers(new int[]{2, 4, -9, 6}, 1) == false;
//        assert TargetSumExistsInThreeNumbers(new int[]{2, 4, 10, 5, -9}, 3) == true;
//        assert TargetSumExistsInThreeNumbers(new int[]{2, 4, 10, 5, -9}, 170) == false;
        System.out.println("Done!");
    }

    private static boolean TargetSumExistsInTwoNumbers(int[] list, int target) {
        return false;
    }

    private static boolean TargetSumExistsInThreeNumbers(int[] list, int target) {
        return false;
    }
}
