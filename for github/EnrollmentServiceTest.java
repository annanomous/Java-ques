package Qn4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnrollmentServiceTest {
    private EnrollmentService service;

    @BeforeEach
    public void setUp() {
        service = new EnrollmentService();
    }

    @Test
    public void testEnrollStudent() {
        assertAll(
            () -> assertTrue(service.enrollStudent("student1", "Course1")),
            () -> assertFalse(service.enrollStudent("student1", "Course1")),
            () -> assertTrue(service.enrollStudent("student1", "Course2")),
            () -> assertTrue(service.enrollStudent("student2", "Course1"))
        );
    }
}


