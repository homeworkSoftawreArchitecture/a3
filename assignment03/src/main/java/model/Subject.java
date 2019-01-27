package model;

public interface Subject {

    /**
     * 注册管理员
     * @param administrator
     */
    public void registerAdministrator(Administrator administrator);

    /**
     * 移除管理员
     * @param administrator
     */
    public void removeAdministrator(Administrator administrator);

    /**
     * 通知所有管理员
     */
    public void notifyAllAdministrator(String message);



}
