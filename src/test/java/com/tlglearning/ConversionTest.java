package com.tlglearning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    @Test
    void convertToDecimal() {
        assertEquals(173, Conversion.convertToDecimal("10101101"));
    }
}