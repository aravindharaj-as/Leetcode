package DSA.ArraysAndStrings.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

import DSA.util.Input.GetInput;

public class RomanToInteger {
    public static void main(String[] args) {
        String input = GetInput.getString();

        System.out.println("Converted Integer Value: " + romanToInt(input));
    }

    public static int romanToInt (String s) {
        Map<Character, Integer> romanValueMap = new HashMap<>();
        romanValueMap.put('I', 1);
        romanValueMap.put('V', 5);
        romanValueMap.put('X', 10);
        romanValueMap.put('L', 50);
        romanValueMap.put('C', 100);
        romanValueMap.put('D', 500);
        romanValueMap.put('M', 1000);
        
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if(i < s.length() -1 && romanValueMap.get(s.charAt(i)) < romanValueMap.get(s.charAt(i + 1))) {
                result -= romanValueMap.get(s.charAt(i));
            }
            else {
                result += romanValueMap.get(s.charAt(i));
            }
        }

        return result;
    }
}
