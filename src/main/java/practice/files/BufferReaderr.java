package practice.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderr {
    static void main(String[] args) throws IOException {
        File file = new File("./sample.txt");
        if (!file.exists())
            file.createNewFile();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        fr.close();
    }
}
