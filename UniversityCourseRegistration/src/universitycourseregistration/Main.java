package universitycourseregistration;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                165,
                "Zainab Jabbar",
                "Software Engineering"
        );

        System.out.println("===== STUDENT INFORMATION =====");

        student.displayStudent();
    }
}
