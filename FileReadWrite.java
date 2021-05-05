package marylandplants;

import java.io.*;

public interface FileReadWrite {

    // read back object from data file
    static Object readDataFromFile(String filePath) {
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object newObject = objectIn.readObject();
            System.out.println("Successfully inported object from file" + filePath);
            objectIn.close();
            return newObject;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // writing object to data file
    static void writeDataToFile(Object object, String filePath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(object);
            objectOut.close();
            System.out.println("Plant successully written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
