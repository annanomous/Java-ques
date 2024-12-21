package Qn4;

public class NotificationService {

    // Method to send an email
    public boolean sendEmail(String email, String message) {
        return isValidEmail(email);
    }

    // Method to validate email address
    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        
        // Test cases
        System.out.println(service.sendEmail("test@example.com", "Hello, this is a test email!")); // should return true
        System.out.println(service.sendEmail("invalid-email", "This email should fail.")); // should return false
    }
}
