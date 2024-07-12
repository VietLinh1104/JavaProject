package com.Value;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Controller {
    Number obj = new Number();
    SystemIn si = new SystemIn();
    ArrayList<Number> list = new ArrayList<>();
    String FILE_NAME = "numbers.dat";

    public void checkFile() {
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
                BufferedInputStream bis = new BufferedInputStream(fis);) {
            ObjectInputStream ois = new ObjectInputStream(bis);
            obj = (Number) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    public void createObj() {

        int value = si.inputInt("value");

        int min = si.inputInt("min");

        int max = si.inputInt("max");

        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
                ObjectOutputStream objStream = new ObjectOutputStream(fos);) {
            list.add(new Number(min, max, value));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayList() {
        for (Number num : list) {

            System.out.println(num);
        }
    }

}
