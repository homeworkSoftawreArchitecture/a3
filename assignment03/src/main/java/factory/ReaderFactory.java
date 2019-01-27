package factory;

import model.EPUBReader;
import model.PDFReader;
import model.Reader;
import model.WordReader;

public class ReaderFactory {

    private static Reader reader;

    public static Reader getReader(String format){

        format.toLowerCase();
        if(format.equals("pdf")){
            reader = new PDFReader();
        }
        if(format.equals("word")){
            reader =  new WordReader();
        }
        if(format.equals("epub")){
            reader =  new EPUBReader();
        }
        return reader;
    }
}
