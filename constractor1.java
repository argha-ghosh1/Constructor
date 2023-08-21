class Student
{
    private String name;
    private int age;

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class constractor1
{
    public static void main(String args[])
    {
        Student st=new Student("Argha",23);
        st.getName();
    }
}