package universitycourseregistration;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                165,
                "Zainab Jabbar",
                "Software Engineering"
        );

        Course course = new Course(
                "SCD-201",
                "Software Configuration and Deployment",
                3
        );

        System.out.println("===== STUDENT INFORMATION =====");
        student.displayStudent();

        System.out.println();

        System.out.println("===== COURSE INFORMATION =====");
        course.displayCourse();
    }
}