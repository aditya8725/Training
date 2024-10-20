class Address {
    String city;
    String state;
    String country;
    String zipcode;

    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Zipcode: " + zipcode);
    }
}

class Employee {
    int id;
    String name;
    String emailId;
    Address address; // Aggregation (Employee "has an" Address)

    public Employee(int id, String name, String emailId, Address address) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.address = address;
    }

    public void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email ID: " + emailId);
        address.displayAddress();
    }
}

public class PAggeration {
    public static void main(String[] args) {
        Address address = new Address("New York", "NY", "USA", "10001");
        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", address);
        employee.displayEmployee();
    }
}
