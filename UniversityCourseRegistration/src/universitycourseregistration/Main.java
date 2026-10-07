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

        Registration registration =
                new Registration(student, course);

        registration.displayRegistration();
    }
}