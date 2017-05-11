package com.company.readproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by dell on 8/5/17.
 */
public class ReadingProperties {

    public static void main(String[] args) throws IOException {
        String path ="/home/dell/Desktop/LetsCodeIt/JavaTutorials/src/com/company/readproperties/test.properties";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(path);
        prop.load(fis);

        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("surname"));

    }
}
