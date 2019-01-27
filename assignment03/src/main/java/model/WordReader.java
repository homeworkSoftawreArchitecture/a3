package model;

import java.io.*;
import org.apache.poi.POITextExtractor;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFComment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.xmlbeans.XmlException;

public class WordReader implements Reader {
    @Override
    public String read(String path) throws IOException {
        String result = null;
        File file = new File(path);
        try {
            FileInputStream fis = new FileInputStream(file);
            XWPFWordExtractor wordExtractor = null;
            try {
                wordExtractor = new XWPFWordExtractor(OPCPackage.open(fis));
            } catch (XmlException e) {
                e.printStackTrace();
            } catch (OpenXML4JException e) {
                e.printStackTrace();
            }
            result = wordExtractor.getText();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
