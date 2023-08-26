package com.mycompany.utility;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

// apache commons codec
public class CodecUtility implements ApacheCommons {

    @Override
    public void evaluate() {

        String origText = "Hello Apache Commons Codec";

        System.out.println("Original String: "+origText);
        byte[] encodedBytes = Base64.encodeBase64(origText.getBytes());
        String encodedText = new String(encodedBytes);
        System.out.println("Encoded: " + encodedText );

        byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
        String decodedText = new String(decodedBytes);
        System.out.println("Decoded: "+decodedText);

        String passwordToHash = "Password123";
        String mdHash = DigestUtils.md2Hex(passwordToHash);
        System.out.println("MD5 Hash: "+mdHash);


    }
}
