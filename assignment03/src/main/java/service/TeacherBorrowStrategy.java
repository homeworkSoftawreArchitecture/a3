package service;

import model.Book;

import java.util.ArrayList;

public class TeacherBorrowStrategy implements BorrowStrategy {

    @Override
    public boolean borrow(ArrayList<Book> book) {
        System.out.println("graduate borrow book");
        return true;
    }
}
