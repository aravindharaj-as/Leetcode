package DSA.ArraysAndStrings.ProductOfArrayExceptSelf;

import java.util.Arrays;

import DSA.util.Input.GetInput;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] input = GetInput.getIntArray();

        System.out.println("Product of Array Except Self: " + Arrays.toString(productExceptSelf(input)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];
        Arrays.fill(result, 1);

        int multiplier = 1;

        for (int i = 0; i < n; i++) {
            result[i] *= multiplier;
            multiplier *= nums[i];
        }

        multiplier = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= multiplier;
            multiplier *= nums[i];
        }

        return result;
    }
}
