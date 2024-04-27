package MainApplication;

import java.io.*;
import java.util.ArrayList;

public class DataStore {
    public static <E> void saveData(String fileName, E data) {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <E> E loadData(String fileName) throws IOException {
        FileInputStream fis;
        fis = new FileInputStream(fileName);

        ObjectInputStream ois;
        ois = new ObjectInputStream(fis);

        try {
            Object data = ois.readObject();
            if (data == null)
                return null;

            return (E) data;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
