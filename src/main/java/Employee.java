
import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private String employee;
    private char gender;
    private String title;

    public Employee() {  }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // getters and setters
}