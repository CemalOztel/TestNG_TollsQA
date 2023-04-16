package toollsQA.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try {
            //what file to read//hangi dosya okunmalı
            String path = "configuration.properties";
            //read the file into java, finds the file using the string path
            //dosyayı java'da oku, dizi yolunu kullanarak dosyayı bul
            FileInputStream input = new FileInputStream(path);
            //properties --> class that store properties in key / value format
            //properties -->özellikleri anahtarda depolayan sınıf/değer biçimi
            properties = new Properties();
            //the values from the file input is loaded / fed in to the properties object
            // dosya girişindeki değerler yüklenir / özellikler nesnesine beslenir
            properties.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //how can we call the configurationReader
    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }// privat oldugu icin getter method yazdi
}
