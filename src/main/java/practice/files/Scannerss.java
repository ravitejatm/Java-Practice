package practice.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Scannerss {
    static void main(String[] args) throws IOException{
        File file = new File("./sample.txt");
        if (!file.exists())
            file.createNewFile();

        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}
