package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class studenttt
{
    @Value("Aditya")
    private String name;
    @Value("104")
    private int rollNo;
    @Value("adi@gmail.com")
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void display()
    {
        System.out.println("Name:"  + name);
        System.out.println("RollNo: "+rollNo);
        System.out.println("Email: "+email);
    }
}
