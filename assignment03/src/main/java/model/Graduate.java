package model;

import serviceImpl.GraduateBorrowStrategy;

import java.util.ArrayList;

public class Graduate extends User {
    String name;
    String id;
    String type = "graduate";
    int permission;
    String department;
    String penaltyReport;
    String borrowingReport;

    public Graduate(String name, String id, int permission, String department) {
        this.department = department;
        this.permission = permission;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean borrowBooks(ArrayList<Book> books) {
        GraduateBorrowStrategy graduateBorrowStrategy = new GraduateBorrowStrategy();
        graduateBorrowStrategy.borrow(books);
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
