package DSA.ArraysAndStrings.SummaryRanges;

import java.util.ArrayList;
import java.util.List;

import DSA.util.Input.GetInput;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] input = GetInput.getIntArray();

        System.out.println("Summary Ranges: " + summaryRange(input));
    }

    public static List<String> summaryRange(int[] nums) {
        List<String> result = new ArrayList<>();

        if(nums == null || nums.length == 0) {
            return result;
        }

        int i = 0;
        int startingNumber;

        while (i < nums.length) {
            startingNumber = nums[i];

            while (i < nums.length - 1 && nums[i + 1] == nums[i] + 1) i++;

            if(startingNumber == nums[i]) {
                result.add(String.valueOf(startingNumber));
            }
            else {
                result.add(startingNumber + "->" + nums[i]);
            }

            i++;
        }

        // for(int i = 1; i < nums.length; i++) {
        //     if (nums[i] - nums[i - 1] != 1) {
        //         if (startingNumber == nums[i - 1]) {
        //             result.add(Integer.toString(startingNumber));
        //         }
        //         else {
        //             result.add(startingNumber + "->" + nums[i - 1]);
        //         }

        //         startingNumber = nums[i];
        //     }
        // }

        // if (startingNumber == nums[nums.length - 1]) {
        //     result.add(Integer.toString(startingNumber));
        // }
        // else {
        //     result.add(startingNumber + "->" + nums[nums.length - 1]);
        // }

        return result;
    }
}
