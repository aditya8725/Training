interface Vehiclee
{
    default void vehdetail()
    {
        System.out.println("I m a vehicle");
    }

    public void drive();
}

public class UDefaultMethod1 implements Vehiclee
{
    public void drive()
    {
        System.out.println("Vehicle is driving");
    }
    public static void main(String[] args) 
    {
        UDefaultMethod1 ud = new UDefaultMethod1();
        ud.vehdetail();
        ud.drive();
    }

}
