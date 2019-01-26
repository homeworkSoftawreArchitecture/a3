package service;

import model.User;

public interface Permission {
    void setPermission(int permission, User user);
    boolean createUserInfo(User user, String info);
    boolean searchUserInfo(User user, String info);
}
