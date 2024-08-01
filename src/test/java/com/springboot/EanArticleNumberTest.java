package com.springboot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EanArticleNumberTest {

    @Test
    void testExtractMercaCode() {
        EANParser parser = new EANParser();
        String ean = "8480000278623";
        assertEquals("27862", parser.extractMercaCode(ean));
    }

    @Test
    void testExtractPriceForVariableWeightProduct() {
        EANParser parser = new EANParser();
        String ean = "2369664001999";
        assertEquals("1.99", parser.extractPrice(ean));
    }
    @Test
    void testExtractMercaCodeAndPriceForVariableWeightProduct() {
        EANParser parser = new EANParser();
        String ean = "2369664001999";
        assertEquals("69664", parser.extractMercaCode(ean));
        assertEquals("1.99", parser.extractPrice(ean));
    }

    @Test
    void testExtractMercaCodeForVariableWeightProduct() {
        EANParser parser = new EANParser();
        String ean = "2369664001999";
        assertEquals("69664", parser.extractMercaCode(ean));
    }

}
