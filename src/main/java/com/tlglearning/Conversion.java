package com.tlglearning;

public class Conversion {

    public static int convertToDecimal(String binary) {
        int value = 0;
        for (char c : binary.toCharArray()) {
            value = (value << 1) + c - '0';

        }
        return value;
    }
    // Need test cases and test plans. Check for a + or -
    /**
     *
     * @param representation
     * @param radix
     * @return
     * @throws IllegalArgumentException If {@code radix < 2 || radix > 10};
     */
    public static int parse(String representation, int radix) throws IllegalArgumentException {
        if (radix < 2 || radix > 10) {
            throw new IllegalArgumentException(String.format(INVALID_RADIX_FORMAT, radix));
        }
        char[] digits = representation.toCharArray();
        char firstDigit = digits[0];
        boolean hasSign = firstDigit == '+' || firstDigit == '-';
        int sign = (hasSign && firstDigit == '-') ? -1 : 1;
        int value = 0;
        for (int i = (hasSign ? 1 : 0); i < digits.length; i++) {
            char digitChar = digits[i];
            int digitValue = digitChar - DIGIT_CHAR_BASE;
            value = value * radix + digitValue;
        }
        return value * sign;
    }
}
