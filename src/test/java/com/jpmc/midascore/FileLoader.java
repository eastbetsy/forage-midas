package com.jpmc.midascore;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

@Component
public class FileLoader {

    public String[] loadStrings(String path) {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream(path);
            String fileText = IOUtils.toString(inputStream, "UTF-8");
            return fileText.split(System.lineSeparator());
        } catch (IOException e) {
            return null;
        }
    }
}
