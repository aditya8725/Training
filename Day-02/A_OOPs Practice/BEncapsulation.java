class person
{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id>0)
        {
            this.id = id;
        }
        else
        {
            System.out.println("Id must be greater than 0");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class BEncapsulation
{
    public static void main(String[] args) 
    {
        person p = new person();
        p.setId(1);
        p.setName("Aditya");

        System.out.println("ID: "+p.getId() + " Name: "+p.getName());

        p.setId(-5);
        p.setName("Ranjan");
        System.out.println("ID: "+p.getId() + " Name: "+p.getName());
    }
}