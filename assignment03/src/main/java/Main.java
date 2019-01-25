import model.PDFReader;
import model.Reader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Reader reader = new PDFReader();
        try {
            System.out.println(reader.read("/Users/apple/a3/assignment03/assignment-3.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}