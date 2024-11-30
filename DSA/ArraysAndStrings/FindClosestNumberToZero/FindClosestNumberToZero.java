package DSA.ArraysAndStrings.FindClosestNumberToZero;

import DSA.util.Input.GetInput;

public class FindClosestNumberToZero {
    public static void main(String[] args) {
        int[] inputNumbers = GetInput.getIntArray();

        System.out.println("Input Array");

        for (int i : inputNumbers) {
            System.out.print(i + " ");
        }

        System.out.println("Closest Number to zero: " + findClosestNumber(inputNumbers));
    }

    public static int findClosestNumber (int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        if (nums.length > 1000) {
            System.exit(0);
        }
        
        int closestNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int difference = Math.abs(nums[i]);
            if(difference < (Math.abs(closestNumber))) {
                closestNumber = nums[i];
            }
            else if (difference == (Math.abs(closestNumber))) {
                closestNumber = nums[i] > closestNumber ? nums[i] : closestNumber;
            }
        }

        return closestNumber;
    }
}
