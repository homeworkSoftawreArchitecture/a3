package model;

public interface Subject {

    /**
     * ע�����Ա
     * @param administrator
     */
    public void registerAdministrator(Administrator administrator);

    /**
     * �Ƴ�����Ա
     * @param administrator
     */
    public void removeAdministrator(Administrator administrator);

    /**
     * ֪ͨ���й���Ա
     */
    public void notifyAllAdministrator(String message);



}
