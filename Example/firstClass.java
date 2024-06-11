
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class firstClass {
    
    public class Person {
        protected int day;
        protected int mon;
        protected int year;
        public String name;

        public Person(int day,int mon,int year, String name){
            this.day = day;
            this.mon = mon;
            this.year = year;
            this.name = name;
        }
        public void displayInfo(){
            System.out.println("Name: "+ name);
            System.out.println("Date: "+ day+"/"+mon+"/"+year);
        }
    }

    public class Staff extends Person{
        protected int staffID;
        protected String position;

        public Staff(int day, int mon, int year , String name ,int staffID, String position){
            super(day, mon, year, name); 
            this.staffID = staffID;
            this.position = position;
        }

        public void displayInfo(){
            System.out.println("Name: "+ name);
            System.out.println("Date: "+ day+"/"+mon+"/"+year);
            System.out.println("Staff ID: "+ staffID);
            System.out.println("Position: "+ position);
        }
    }


    public static void main(String[] args){
        firstClass firstClassInstance = new firstClass(); // Tạo một instance của firstClass

        // Tạo một instance của Person trong firstClassInstance
        ArrayList<Staff> object1 = new ArrayList<>();

        object1.add(firstClassInstance.new Staff(6, 2, 2004, "NameA",1,"NV"));
        object1.add(firstClassInstance.new Staff(10, 8, 1995, "NameB",2,"GD"));

        // Lặp qua ArrayList và in thông tin của mỗi đối tượng
        for (Staff staff : object1) {
            staff.displayInfo();
            System.out.println(); // In ra dòng trống giữa các đối tượng
        }

        
        
    }
}
