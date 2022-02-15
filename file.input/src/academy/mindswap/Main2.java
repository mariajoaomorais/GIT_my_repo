import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {

        FileInputStream fileToRead = null;

        try {
            fileToRead = new FileInputStream("./src/file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        byte[] buffer = new byte[1034];

        try{
            byte[] allBytes = fileToRead.readAllBytes();

            System.out.println((allBytes.length));
            for(byte b : allBytes){

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        try {
            int num = fileToRead.read(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (byte b : buffer){
            if(b!=0){
                System.out.print((char) b);
            }
        }
         */
        try {

            while ((fileToRead.read(buffer)) != -1) {
                System.out.print("\nentered while");
                for (byte b : buffer) {
                    if (b != 0) {
                        System.out.println((char) b);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
