class Student {

    String name;
    int rollno;

    // Parameterized Constructor
    Student(String s_name, int s_roll) {
        System.out.println("Constructor Invoked");
        this.name = s_name;
        this.rollno = s_roll;
    }

    // Copy Constructor
    Student(Student s) {
        System.out.println("Copy Constructor Invoked");
        this.name = s.name;
        this.rollno = s.rollno;
    }

    // Display method
    public void display() {
        System.out.println("name=" + name + " rollno=" + rollno);
    }
}

// Main class
class MyProgramCopy {
    public static void main(String[] args) {

        Student s1 = new Student("Darshan", 101);
        Student s2 = new Student(s1);   // invoking Copy Constructor

        s1.display();
        s2.display();
    }
}