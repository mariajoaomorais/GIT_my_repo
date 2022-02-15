package academy.mindswap;

public class Main {

    public static void main(String[] args) {

    CopyFile.copyFile("Teste.txt", "Destiny.txt");

    CopyFile.copyFileByteByByte("Teste.txt", "Destiny2.txt");


    //(new FileCopy(){
        // .start("resources/img.png", "resources/img_copy.png")
        // }
    }
}
