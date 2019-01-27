package model;

import serviceImpl.UndergraduateBorrowStrategy;

import java.util.ArrayList;

public class Undergraduate extends User {
    String name;
    String id;
    String type = "undergraduate";
    int permission;
    String department;
    String penaltyReport;
    String borrowingReport;

    public Undergraduate(String name, String id, int permission, String department) {
        this.department = department;
        this.permission = permission;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean borrowBooks(ArrayList<Book> books) {
        UndergraduateBorrowStrategy undergraduateBorrowStrategy = new UndergraduateBorrowStrategy();
        undergraduateBorrowStrategy.borrow(books);
        return false;
    }

    @Override
    public String getPenaltyReport() {
        return penaltyReport;
    }

    @Override
    public String getBorrowingReport() {
        return borrowingReport;
    }

    @Override
    public String getName() {
        return name;
    }
}
