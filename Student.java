import java.security.PrivateKey;

public class Student extends Person {
    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "status=" + status + "} " + super.toString();
    }
}
