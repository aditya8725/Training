class Vehicle
{
    String brand;
    int speed;

    void displaydetails()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
    }
}


class car1 extends Vehicle
{
    String color;
    int noofdoors;

    void display()
    {
        displaydetails();
        System.out.println("Color: "+color);
        System.out.println("No of doors: "+noofdoors);
    }
}


public class CInheritance 
{
    public static void main(String[] args) 
    {
        car1 c = new car1();
        c.brand = "Toyota";
        c.speed = 100;

        c.color="red";
        c.noofdoors=4;

        c.displaydetails();
        System.out.println("==================");
        c.display();
    }
}
