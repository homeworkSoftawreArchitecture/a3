package service;

import model.Administrator;
import model.Undergraduate;
import model.User;

public class PermissionProxy implements Permission {

    public void setPermission(int permission, User user) {
        // judge user
        if(permission < 0) {
            System.out.println("Permission too small!");
            return;
        }

        String type = user.getClass().getName().substring(6);
        System.out.println("type is " + type);

        if(type.equals("Undergraduate")){
            System.out.println("undergraduate set permission " + permission);
            user.setPermission(permission);
        }

        if(type.equals("Graduate")){
            System.out.println("graduate set permission " + permission);
            user.setPermission(permission);
        }

        if(type.equals("Teacher")){
            System.out.println("teacher set permission " + permission);
            user.setPermission(permission);
        }

        // future consideration
        user.setPermission(permission);
    }
}
