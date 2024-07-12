package Nguoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class File {
    private static String FILENAME = "data.dat";

    public static void main(String[] args) {
        ArrayList<NhanVien> objs = new ArrayList<>();
        SystemIn si = new SystemIn();

        int n = si.inputInt("n");
        for (int i = 1; i <= n; i++) {
            NhanVien obj = new NhanVien();
            obj.creatObj();
            objs.add(obj);
        }

        try (FileOutputStream fis = new FileOutputStream(FILENAME);
                ObjectOutputStream oos = new ObjectOutputStream(fis)) {
            oos.writeObject(objs);
        } catch (Exception e) {

        }

        ArrayList<NhanVien> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(FILENAME);
                ObjectInputStream oos = new ObjectInputStream(fis)) {
            list = (ArrayList<NhanVien>) oos.readObject();
        } catch (Exception e) {
            System.out.println("No existing book data found. Starting with an empty list.");
        }

        for (NhanVien obj : list) {
            System.out.println(obj);
        }

    }

}
