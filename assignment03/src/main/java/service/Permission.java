package service;

import model.User;

public interface Permission {
    void setPermission(int permission, User user);
}
