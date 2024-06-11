import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class mammalProject {
    // input
    Scanner inputObj = new Scanner(System.in);

    // Date Format
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Format Date
    Date currentDate = new Date(); // Current Date

    class DateSplit {
        public Date dateOut;
        String dateInput;

        public DateSplit(String dateInput) {
            String datePart[] = dateInput.split("/");

            int day = Integer.parseInt(datePart[0]);
            int month = Integer.parseInt(datePart[1]);
            int year = Integer.parseInt(datePart[2]);

            this.dateOut = new Date(year - 1900, month - 1, day);
        }

        public Date getDateSplit() {
            return dateOut;
        }
    }

    // Mammals class
    class Mammals {
        public DateSplit birthDateSl;
        public int ageDays;
        public Date birthDate;

        // constructor
        public Mammals(String birthDateSl) {
            setDateOfBirth(birthDateSl);
        }

        // Set Date of birth
        void setDateOfBirth(String birthDateSl) {
            this.birthDateSl = new DateSplit(birthDateSl);
            this.birthDate = this.birthDateSl.getDateSplit();

        }

        // Get age day
        int getAgeAsDays() {
            long currentTimeMillis = currentDate.getTime();
            long inputTimeMillis = birthDate.getTime();
            this.ageDays = (int) (currentTimeMillis - inputTimeMillis) / (1000 * 60 * 60 * 24);
            return ageDays;
        }

        // Display
        void displayBirth() {
            String strDate = dateFormat.format(birthDate);
            System.out.println("Date: " + strDate);
        }
    }

    class BloodGroup {
        public String bloodType;

        // constructor
        public BloodGroup(String bloodType) {
            this.bloodType = bloodType;
        }

        // get
        public String getBloodGroup() {
            return bloodType;
        }
    }

    class Address {
        protected String postcode;

        public Address(String postcode) {
            this.postcode = postcode;
        }

        public String getPostcode() {
            return postcode;
        }

    }

    class Person extends Mammals {
        protected String firstname;
        protected BloodGroup bloodGroup;
        protected Address postcode;
        protected DateSplit birthDate;

        // constructor
        public Person(String firstname, String bloodGroup, String postcode, String birthDate) {
            super(birthDate);
            this.firstname = firstname;
            this.bloodGroup = new BloodGroup(bloodGroup);
            this.postcode = new Address(postcode);
        }

        // set
        void setFirstname() {
            System.out.print("First Name: ");
            this.firstname = inputObj.nextLine();
        }

        void setBloodGroup(String bloodGroup) {
            this.bloodGroup = new BloodGroup(bloodGroup);
        }

        void setAddress(String postcode) {
            this.postcode = new Address(postcode);
        }

        // get
        String getFirstname() {
            return firstname;
        }

        String getBloodGroup() {
            return bloodGroup.getBloodGroup();
        }

        String getPostcode() {
            return postcode.getPostcode();
        }

    }

    public static void main(String[] args) {
        mammalProject mammalProjectInstance = new mammalProject();

        Person haha = mammalProjectInstance.new Person("haha", "O", "71000", "21/5/2024");
        System.out.println("Days: " + haha.getAgeAsDays());

    }
}
