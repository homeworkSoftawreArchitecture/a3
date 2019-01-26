package model;

import service.TeacherBorrowStrategy;

import java.util.ArrayList;

public class Teacher extends User {
    String name;
    String id;
    String type = "teacher";
    int permission;
    String department;
    String penaltyReport;
    String borrowingReport;

    public Teacher(String name, String id, int permission, String department) {
        this.department = department;
        this.permission = permission;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean borrowBooks(ArrayList<Book> books) {
        TeacherBorrowStrategy teacherBorrowStrategy = new TeacherBorrowStrategy();
        teacherBorrowStrategy.borrow(books);
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
