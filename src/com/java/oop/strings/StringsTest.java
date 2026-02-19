package com.java.oop.strings;

import java.util.Arrays;

public class StringsTest {
    public static void main(String[] args) {

        String str = "abc";
        String str1 = "ABC";
        String str2 = " nithin ";
        String username = new String("nithin");
        String password = new String("nithinreddy");
        String newStr = new String("abc");

        // 1. charAt() → returns character at given index
        System.out.println("charAt(0): " + newStr.charAt(0));

        // 2. compareTo() → compares lexicographically
        System.out.println("compareTo: " + str.compareTo(newStr)); // 0 (equal)

        // 3. compareToIgnoreCase() → ignores case differences
        System.out.println("compareToIgnoreCase: " + str.compareToIgnoreCase(str1)); // 0

        // 4. equals() → checks content equality
        System.out.println("equals: " + str.equals(newStr)); // true

        // 5. equalsIgnoreCase() → ignores case while comparing
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(str1)); // true

        // 6. split() → converts string to array
        String arr = "111,nithin,nithin@gmail.com";
        String[] strArr = arr.split(",");
        System.out.println("Split result: " + Arrays.toString(strArr));

        // 7. toLowerCase() and toUpperCase()
        System.out.println("toLowerCase: " + str1.toLowerCase());
        System.out.println("toUpperCase: " + str.toUpperCase());

        // 8. length() → returns string length
        System.out.println("Length: " + str.length());

        // 9. trim() → removes leading & trailing spaces
        System.out.println("Trimmed: '" + str2.trim() + "'");

        // 10. equals after trim
        String str4 = str2.trim();
        System.out.println("Trim equals username: " + str4.equals(username));

        // 11. toCharArray() → string to char array
        String str6 = "nithin";
        char[] str7 = str6.toCharArray();
        System.out.print("String to char array: ");
        for (char c : str7) {
            System.out.print("'" + c + "' ");
        }
        System.out.println();

        // 12. Array to String using Arrays.toString()
        System.out.println("Array to String: " + Arrays.toString(str7));

        // 13. concat() → joins strings
        String fullName = "Nithin".concat(" Reddy");
        System.out.println("Concat result: " + fullName);

        // 14. contains() → checks substring
        System.out.println("Contains 'nit': " + str6.contains("nit"));

        // 15. startsWith() and endsWith()
        System.out.println("Starts with 'ni': " + str6.startsWith("ni"));
        System.out.println("Ends with 'in': " + str6.endsWith("in"));

        // 16. indexOf() → finds position
        System.out.println("Index of 't': " + str6.indexOf('t'));
    }
}
