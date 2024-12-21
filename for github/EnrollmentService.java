package Qn4;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {
    private List<String> enrollments;

    public EnrollmentService() {
        enrollments = new ArrayList<>();
    }
    // Method to enroll a student in a course
    public boolean enrollStudent(String studentUsername, String courseName) {
        String enrollment = studentUsername + ":" + courseName;
        if (enrollments.contains(enrollment)) {
            return false; // Student is already enrolled in the course
        } else {
            enrollments.add(enrollment);
            return true; // Student successfully enrolled
        }
    }
    public static void main(String[] args) {
        EnrollmentService service = new EnrollmentService();

        // Example usage
        System.out.println(service.enrollStudent("student1", "Course1")); // true
        System.out.println(service.enrollStudent("student1", "Course1")); // false
        System.out.println(service.enrollStudent("student1", "Course2")); // true
        System.out.println(service.enrollStudent("student2", "Course1")); // true
    }
}
