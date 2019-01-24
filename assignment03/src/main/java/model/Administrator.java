package model;

public class Administrator implements User{
    String name;
    String id;

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

    public boolean editBookInfo() {

    }

    public void generateBorrowingReport() {

    }

    public void generatePnaltyReport() {

    }

    public void getInfo() {

    }
}
