import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Administrator administrator = new Administrator("admin","0001");
        Teacher teacher = new Teacher("teacher","0002",0,"Software");
        Graduate graduate = new Graduate("graduate","0003",0,"Software");
        Undergraduate undergraduate = new Undergraduate("undergraduate","0004",0,"Software");
        Book book = new Book("0005","Software Architecture","Software","Dr. Zhang");

        administrator.setPermission(-1,undergraduate);
        administrator.setPermission(1,undergraduate);
        administrator.setPermission(2,graduate);
        administrator.setPermission(3,teacher);

        ArrayList<Book> arrayList = new ArrayList<Book>();
        arrayList.add(book);
        undergraduate.borrowBooks(arrayList);
        graduate.borrowBooks(arrayList);
        teacher.borrowBooks(arrayList);

        administrator.editBookInfo(book,"0006","Software Architecture","Software","Dr. Zhang");

        administrator.generateBorrowingReport(teacher);
        administrator.generatePenaltyReport(undergraduate);
    }
}