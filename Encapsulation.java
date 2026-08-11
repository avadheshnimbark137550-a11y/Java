class Student {
    // Private data members
    private int rollNo;
    private String name;

    // Setter method for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter method for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setter methods
        s.setRollNo(101);
        s.setName("Avadhesh");

        // Getting values using getter methods
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
    }
}