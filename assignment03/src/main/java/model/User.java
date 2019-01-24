package model;

import java.util.ArrayList;

public interface User {
    boolean borrowBooks(ArrayList<Book> books);
    boolean editInfo();
}