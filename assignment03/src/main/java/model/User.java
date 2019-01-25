package model;

import java.util.ArrayList;

public class User {
    String name;
    String id;
    String type;
    int permission;
    String department;
    String borrowingReport;
    String penaltyReport;

    public boolean borrowBooks(ArrayList<Book> books) {
        return false;
    }


    public boolean editInfo() {
        return false;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public String getBorrowingReport() {
        return borrowingReport;
    }

    public String getPenaltyReport() {
        return penaltyReport;
    }

    public String getType() {
        return type;
    }

    public int getPermission() {
        return permission;
    }

    public String getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}