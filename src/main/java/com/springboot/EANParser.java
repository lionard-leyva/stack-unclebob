package com.springboot;

public class EANParser {


    public String extractMercaCode(String ean) {
        EANType type = EANType.from(ean);
        if (type == EANType.VARIABLE_WEIGHT) {
            return ean.substring(2, 7);
        } else {
            return ean.substring(7, 12);
        }
    }

    public String extractPrice(String ean) {
        String pricePart = ean.substring(9, 12);
        return pricePart.charAt(0) + "." + pricePart.substring(1, 3);
    }
}

enum EANType {
    VARIABLE_WEIGHT("23"),
    FIXED_WEIGHT("24");

    private final String prefix;

    EANType(String prefix) {
        this.prefix = prefix;
    }

    public static EANType from(String ean) {
        for (EANType type : EANType.values()) {
            if (ean.startsWith(type.prefix)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown EAN type");
    }
}