package practice.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamm {
    static void main(String[] args) throws IOException {

        File file = new File(".SM.txt");
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);

        fos.write("Hello World".getBytes());

        //fos.flush();//flush and close are same
        fos.close();

//        while (line = br.readLine()) != null)
//            existingtext += linr +"\n" +"\n";
//        String s = "new text added to existing"

    }
}
