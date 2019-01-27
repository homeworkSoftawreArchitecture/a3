package serviceImpl;

import model.User;
import service.Permission;

public class PermissionProxy implements Permission {
    // proxy intro:
    // 1-Undergraduate
    // 2-Graduate
    // 3-Teacher
    // 4-now empty
    // 5-search User Info
    // 6-create User Info

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

    @Override
    public boolean createUserInfo(User user, String info) {
        if(user.getPermission() <= 6) {
            System.out.println("Sorry, user " + user.getName() + " permission is not enough for createUserInfo!");
            return false;
        }
        user.createUserInfo(user, info);
        System.out.println("CreateUserInfo success!");
        return true;
    }

    @Override
    public boolean searchUserInfo(User user, String info) {
        if(user.getPermission() <= 5) {
            System.out.println("Sorry, user " + user.getName() + " permission is not enough for searchUserInfo!");
            return false;
        }
        user.searchUserInfo(user, info);
        System.out.println("SearchUserInfo success!");
        return true;
    }
}
