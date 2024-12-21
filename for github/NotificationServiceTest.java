package Qn4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NotificationServiceTest {

    @Test
    public void testSendEmail() {
        NotificationService service = new NotificationService();

        assertAll(
            () -> assertTrue(service.sendEmail("test@example.com", "Hello, this is a test email!")),
            () -> assertFalse(service.sendEmail("invalid-email", "This email should fail."))
        );
    }
}
