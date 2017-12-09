package three;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * <p>创建时间：2017/12/3 18:08
 * <p>three
 * @author caozeal
 * @version 1.0
 */
public class FileProperties extends Properties implements FileIo {
    @Override
    public void readFromFile(String filename) throws IOException {
        try(InputStream is = new FileInputStream(filename)){
            load(is);
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        try(OutputStream os = new FileOutputStream(filename)){
            store(os, "written by FileProperties");
        }
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }

}
