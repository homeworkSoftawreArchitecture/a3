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

        //teacher read online document
        System.out.println("teacher read following files:");
        teacher.readOnlineDocument("./pdfFile.pdf","pdf");
        teacher.readOnlineDocument("./wordFile.docx","word");
        teacher.readOnlineDocument("./epubFile.epub","epub");

        //graduate read online document
        System.out.println("graduate read following files:");
        graduate.readOnlineDocument("./pdfFile.pdf","pdf");
        graduate.readOnlineDocument("./wordFile.docx","word");
        graduate.readOnlineDocument("./epubFile.epub","epub");

        //undergraduate read online document
        System.out.println("undergraduate read folloeing files:");
        undergraduate.readOnlineDocument("./pdfFile.pdf","pdf");
        undergraduate.readOnlineDocument("./wordFile.docx","word");
        undergraduate.readOnlineDocument("./epubFile.epub","epub");

        //teacher edit personal info
        teacher.registerAdministrator(administrator);
        teacher.editInfo("name","teacher2.0");
        teacher.editInfo("department","Finance");

        //graduate edit personal info
        graduate.registerAdministrator(administrator);
        graduate.editInfo("name","graduate2.0");
        graduate.editInfo("department","Finance");

        //undergraduate edit personal info
        undergraduate.registerAdministrator(administrator);
        undergraduate.editInfo("name","undergraduate2.0");
        undergraduate.editInfo("department","Finance");

    }
}