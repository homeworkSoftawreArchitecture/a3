package model;

import java.io.IOException;

public interface Reader {

    /**
     * ��ȡ�ĵ�����
     * @param path
     * @return
     */
    public String read(String path) throws IOException;
}
