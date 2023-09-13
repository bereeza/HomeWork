package org.example.lesson7;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class StringManipulator {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    public String stringReverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public int findWordPosition(String source, String target) {
        int indexPosition;
        if (source.contains(target)) {
            indexPosition = source.indexOf(target);
            System.out.println(source + " contains " + target + " | start position: " + indexPosition);
            return indexPosition;
        } else {
            System.out.println(source + " doesn't contains " + target);
            return -1;
        }
    }

    public int findSymbolOccurrence(String s, char c) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }
}