package serviceImpl;

import model.Book;
import service.BorrowStrategy;

import java.util.ArrayList;

public class GraduateBorrowStrategy implements BorrowStrategy {

    @Override
    public boolean borrow(ArrayList<Book> book) {
        System.out.println("graduate borrow book");
        return true;
    }
}
