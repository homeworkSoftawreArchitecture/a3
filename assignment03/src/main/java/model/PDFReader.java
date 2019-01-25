package model;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import java.io.IOException;

public class PDFReader implements Reader {

    @Override
    public String read(String path) {
        PdfReader reader = null;
        try {
            reader = new PdfReader(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
        StringBuffer buff = new StringBuffer();
        TextExtractionStrategy strategy = null;
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            try {
                strategy = parser.processContent(i,
                        new SimpleTextExtractionStrategy());
            } catch (IOException e) {
                e.printStackTrace();
            }
            buff.append(strategy.getResultantText());
        }
        return buff.toString();
    }
}
