package model;

import java.io.IOException;

public interface Reader {

    /**
     * ¶ÁÈ¡ÎÄµµÄÚÈİ
     * @param path
     * @return
     */
    public String read(String path) throws IOException;
}
