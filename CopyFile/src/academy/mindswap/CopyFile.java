package academy.mindswap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;

public class CopyFile {

   public static void copyFile (String nameOfFileToRead, String nameOfFileToWrite){

        FileInputStream fileToRead = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileToRead =new FileInputStream (nameOfFileToRead);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        byte[] buffer = new byte[10];

        try {
            fileOutputStream = new FileOutputStream(nameOfFileToWrite);

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(fileToRead.available());
            while(fileToRead.read(buffer) != -1) {
                for (byte b: buffer) {
                    if(b != 0){
                        fileOutputStream.write(b);
                    }
                }

                buffer = new byte[10];
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


    public static void copyFileByteByByte (String nameOfFileToRead, String nameOfFileToWrite) {

        FileInputStream fileToRead = null;
        FileOutputStream fileToWrite = null;

        try {
            fileToRead = new FileInputStream(nameOfFileToRead);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            fileToWrite = new FileOutputStream(nameOfFileToWrite);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int b = 0;

        try {

            while ((b = fileToRead.read()) != -1) {
                fileToWrite.write(b);
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
