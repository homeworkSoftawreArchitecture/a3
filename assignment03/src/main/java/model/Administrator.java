package model;

import serviceImpl.PermissionProxy;

public class Administrator implements Observer{
    String name;
    String id;

    public Administrator(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public void editBookInfo(Book book, String id, String name, String category, String author) {
        book.setId(id);
        book.setAuthor(author);
        book.setCategory(category);
        book.setName(name);
        System.out.println("Book " + book.id + " is being edited.");
    }

    public void generateBorrowingReport(User user) {
        user.getBorrowingReport();
        System.out.println(user.getName() + " get borrowing report");
    }

    public void generatePenaltyReport(User user) {
        user.getPenaltyReport();
        System.out.println(user.getName() + " get penalty report");
    }

    public void getInfo() {

    }

    public void setPermission(int permission, User user) {
        PermissionProxy permissionProxy = new PermissionProxy();
        permissionProxy.setPermission(permission, user);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name+" get message: "+message);
    }
}
