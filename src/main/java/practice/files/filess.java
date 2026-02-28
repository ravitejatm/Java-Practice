package practice.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//FileInputStream and FileReader are same
public class filess {
    static void main(String[] args) throws IOException {
        File file = new File("./sample.txt");
        if (!file.exists())
            file.createNewFile();
      //  file.delete(); to delete

        //to read data inputstream we use
        FileInputStream fis = new FileInputStream(file);

        int asciCode;
        while ((asciCode = fis.read()) != -1) {
            System.out.print((char) asciCode);
        }

       // fis.read(); //to read data character by character
        fis.close(); // expectly need to close

    }
}
