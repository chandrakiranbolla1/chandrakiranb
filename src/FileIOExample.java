import java.io.*;

public class FileIOExample {
    public static void readFile(String fileName) throws FileNotFoundException {

    }

    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}


