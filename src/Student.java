public class Student {
    String name;
    int age;

    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    public void displayIndo() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }
}
