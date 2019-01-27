package model;

public interface Observer {

    /**
     * 管理员收到更新
     * @param message
     */
    public void update(String message);
}
