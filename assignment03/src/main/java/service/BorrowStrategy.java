package service;

import model.Book;

import java.util.ArrayList;

public interface BorrowStrategy {
    boolean borrow(ArrayList<Book> book);
}
