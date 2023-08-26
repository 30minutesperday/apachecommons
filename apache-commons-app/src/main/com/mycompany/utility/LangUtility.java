package com.mycompany.utility;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class LangUtility implements ApacheCommons {
    @Override
    public void evaluate() {
        String origText = "  Hello Apache Commons Lang  ";
        System.out.println("Orig Text: "+origText);

        String trimmedText = StringUtils.trim(origText);
        System.out.println("Trimmed Text: "+trimmedText);

        boolean isEmpty = StringUtils.isEmpty(trimmedText);
        System.out.println("Is Empty: "+isEmpty);

        String numberString = "12345";
        int intValue = NumberUtils.toInt(numberString,0);
        System.out.println("Integer Value: "+intValue);

        boolean isNumber = NumberUtils.isParsable(numberString);
        System.out.println("Is Number: "+isNumber);

    }
}
