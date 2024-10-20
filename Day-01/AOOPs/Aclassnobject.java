
class Car
{
    String Model;
    int speed;

    
    void display()
    {
        System.out.println("Car Model: "+Model);
        System.out.println("Speed: "+speed);
    }
    
    void accelerate(int inc)
    {
        speed += inc;
    }

    void brake(int dec)
    {
        speed -= dec;
    }
}

public class Aclassnobject {
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.Model = "Honda";
        c.speed=123;
        c.display();

        c.accelerate(10);
        c.display();

        c.brake(5);
        c.display();


        Car c2 = new Car();
        c2.Model = "Suzuki";
        c2.speed=100;
        c.display();

        c2.accelerate(10);
        c2.display();

        c2.brake(5);
        c2.display();
    }
}