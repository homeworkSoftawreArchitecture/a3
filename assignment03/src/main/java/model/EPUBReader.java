package model;

import java.io.*;
import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.epub.EpubReader;


public class EPUBReader implements Reader{
    @Override
    public String read(String path) throws IOException {

        EpubReader epubReader = new EpubReader();
        StringBuilder sb = new StringBuilder();

        //¶ÁepubÎÄ¼þ
        Book book = null;
        try {

            InputStream inputStr = new FileInputStream(path);
            book = epubReader.readEpub(inputStr);
            //book.getMetadata().addTitle("Epublib test book 1");
            //book.getMetadata().addAuthor(new Author("Joe", "Tester"));
            sb.append("Title "+book.getTitle()+"\n");
            sb.append("Author "+book.getMetadata().getAuthors().get(0)+"\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
