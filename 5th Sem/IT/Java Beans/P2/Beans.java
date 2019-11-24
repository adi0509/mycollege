package test;

public class Beans implements java.io.Serializable
{
     
    private String name;
    private int id;
    private String dept;
    Beans(){}
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public String getDept()
    {
    return dept;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setId(int id)
    {
        this.id=id;
    }
}
