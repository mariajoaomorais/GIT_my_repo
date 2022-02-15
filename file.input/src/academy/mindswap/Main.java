package academy.mindswap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FileInputStream fileToRead = null;
        try {
            fileToRead = new FileInputStream("./src/file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int b=0;

        try {
            //  System.out.print((char fileToRead.read()));
        while ((b = fileToRead.read()) != -1) {
            System.out.print((char) b);
        }
        } catch (IOException e) {
                e.printStackTrace();

        } finally {
            try {
                fileToRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
