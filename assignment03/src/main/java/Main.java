import model.*;


import java.util.ArrayList;
import model.PDFReader;
import model.Reader;
import model.WordReader;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // init
        Administrator administrator = new Administrator("admin","0001");
        Teacher teacher = new Teacher("teacher","0002",0,"Software");
        Graduate graduate = new Graduate("graduate","0003",0,"Software");
        Undergraduate undergraduate = new Undergraduate("undergraduate","0004",0,"Software");
        Book book = new Book("0005","Software Architecture","Software","Dr. Zhang");

        // proxy set permission
        administrator.setPermission(-1,undergraduate);
        administrator.setPermission(1,undergraduate);
        administrator.setPermission(2,graduate);
        administrator.setPermission(3,teacher);

        // proxy judge if have permission to do
        teacher.searchUserInfo(teacher,"0003");
        undergraduate.createUserInfo(undergraduate,"info");

        // borrow books
        ArrayList<Book> arrayList = new ArrayList<Book>();
        arrayList.add(book);
        undergraduate.borrowBooks(arrayList);
        graduate.borrowBooks(arrayList);
        teacher.borrowBooks(arrayList);

        // edit book info
        administrator.editBookInfo(book,"0006","Software Architecture","Software","Dr. Zhang");

        // generateBorrowingReport
        administrator.generateBorrowingReport(teacher);

        // generatePenaltyReport
        administrator.generatePenaltyReport(undergraduate);

        Reader pdfReader = new PDFReader();
        Reader wordReader = new WordReader();
        Reader epubReader = new EPUBReader();
        try {
            System.out.println(epubReader.read("/Users/apple/a3/assignment03/1.epub"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        try {
            System.out.println(pdfReader.read("/Users/apple/a3/assignment03/assignment-3.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(wordReader.read("/Users/apple/a3/assignment03/�����˵�.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}