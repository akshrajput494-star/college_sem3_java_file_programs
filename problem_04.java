//Student class — create objects, read/write fields, simulate lifecycle, and observe garbage collection via finalize.

class Student {
    String name = "Alice";
}

class Course {
    String courseName = "Java Programming";
}

public class problem_04 {
    public static void main(String[] args) {
        Student s = new Student();
        Course c = new Course();
        System.out.println(s.name + " enrolled in " + c.courseName);
    }
}
