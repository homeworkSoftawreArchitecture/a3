package model;

import java.util.ArrayList;

// 我感觉这个类没啥用 不然删了吧
public class Student implements User {
    @Override
    public boolean borrowBooks(ArrayList<Book> books) {
        return false;
    }

    @Override
    public boolean editInfo() {
        return false;
    }
}
