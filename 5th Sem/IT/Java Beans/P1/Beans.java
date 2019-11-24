package test;

public class Beans implements java.io.Serializable
{
    private String name;
    private int roll;
    private String course;
    Beans(){}
    public String getName()
    {
        return name;
    }
    public int getRoll()
    {
        return roll;
    }
    public String getCourse()
    {
	    return course;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setCourse(String course)
    {
        this.course=course;
    }
    public void setRoll(int roll)
    {
        this.roll=roll;
    }
    
}
