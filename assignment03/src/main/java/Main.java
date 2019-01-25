import model.PDFReader;
import model.Reader;
import model.WordReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Reader pdfReader = new PDFReader();
        Reader wordReader = new WordReader();
        /*
        try {
            System.out.println(pdfReader.read("/Users/apple/a3/assignment03/assignment-3.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        try {
            System.out.println(wordReader.read("/Users/apple/a3/assignment03/Õ‚¡™’Àµ•.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}