interface Hello
{
    default void msg()
    {
        System.out.println("Hello Adi");
    }

    void msghello(String msg);
}

public class UDefaultMethod implements Hello
{
    public void msghello(String msg)
    {
        System.out.println(msg);
    }

    public static void main(String[] args) 
    {
        UDefaultMethod dm = new UDefaultMethod();
        dm.msg();
        dm.msghello("Work is workship");
    }


}
