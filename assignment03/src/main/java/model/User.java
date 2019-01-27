package model;

import factory.ReaderFactory;
import serviceImpl.PermissionProxy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User implements Subject{
    String name;
    String id;
    String type;
    int permission;
    String department;
    String borrowingReport;
    String penaltyReport;
    List<Administrator> administratorList = new ArrayList<Administrator>();


    public boolean borrowBooks(ArrayList<Book> books) {
        return false;
    }

    public boolean searchUserInfo(User user, String info) {
        PermissionProxy permissionProxy = new PermissionProxy();
        return permissionProxy.searchUserInfo(user, info);
    }

    public boolean createUserInfo(User user, String info) {
        PermissionProxy permissionProxy = new PermissionProxy();
        return permissionProxy.createUserInfo(user, info);
    }

    public boolean editInfo(String infoname, String newinfo) {
        String message = this.getName()+" changes "+infoname+" ,new info = "+newinfo;
        if(infoname.equals("name")){
            this.name = newinfo;
        }
        if(infoname.equals("department")){
            this.department = newinfo;
        }
        this.notifyAllAdministrator(message);
        return true;
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

    public void readOnlineDocument(String path,String format){
        Reader reader = ReaderFactory.getReader(format);
        try {
            System.out.println(reader.read(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void registerAdministrator(Administrator administrator) {
        administratorList.add(administrator);
    }

    @Override
    public void removeAdministrator(Administrator administrator) {
        administratorList.remove(administrator);
    }

    @Override
    public void notifyAllAdministrator(String message) {
        for(Administrator administrator: administratorList){
            administrator.update(message);
        }
    }
}