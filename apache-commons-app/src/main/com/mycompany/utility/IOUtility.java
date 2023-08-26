package com.mycompany.utility;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class IOUtility implements ApacheCommons {

    @Override
    public void evaluate() {

        try {
            String path = System.getProperty("user.dir") +
                    System.getProperty("file.separator");

            String sourceFilePath = path + "config.properties";
            String destFilePath = path + "app.properties";

            File sourceFile = new File(sourceFilePath);
            File destFile = new File(destFilePath);
            FileUtils.copyFile(sourceFile, destFile);
            System.out.println("File copied successfully");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
