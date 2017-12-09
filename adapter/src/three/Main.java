package three;

import java.io.IOException;

/**
 * <p>创建时间：2017/12/3 18:24
 * <p>three
 * @author caozeal
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        FileIo fileIo = new FileProperties();
        try {
            fileIo.readFromFile("adapter\\file.txt");
            fileIo.setValue("year", "2017");
            fileIo.setValue("month", "12");
            fileIo.setValue("day", "3");
            fileIo.writeToFile("adapter\\newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
