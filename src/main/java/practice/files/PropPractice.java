package practice.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropPractice {

        public static void main(String[] args) throws Exception {
            File file = new File("dbConfig.properties");
            if(!file.exists())
                file.createNewFile();
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream(file);
            prop.load(fis);

            prop.setProperty("url", "localhost");
            prop.setProperty("username", "hyrtutorials");
            prop.setProperty("password", "hyr123");

            FileOutputStream fos = new FileOutputStream(file);
            prop.store(fos, "New prop file is created");
//            FileInputStream fis = new FileInputStream(file);
//            prop.load(fis);

            Set<String> keys = prop.stringPropertyNames();
            Set<Object> k = prop.keySet();
            Collection<Object> c = prop.values();
            System.out.println(prop.getProperty("url", "192.168.28.50"));
        }
    }

}
