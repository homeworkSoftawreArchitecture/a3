package serviceImpl;

import model.Book;
import service.BorrowStrategy;

import java.util.ArrayList;

public class UndergraduateBorrowStrategy implements BorrowStrategy {

    @Override
    public boolean borrow(ArrayList<Book> book) {
        System.out.println("undergraduate borrow book");
        return true;
    }
}
