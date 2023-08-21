class Student1
{
    private String name;
    private int age;

    public Student1()
    {
        this("dip",24);
        System.out.println("Zero parameterized constractor");
        name="Argha";
        age=23;
    }
    public Student1(String name)
    {
        this();
        this.name=name;
        age=19;
    }
    public Student1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Constractor3
{
    public static void main(String args[])
    {
        Student1 st1=new Student1();
        st1.disp();

        Student1 st2=new Student1("Argha");
        st2.disp();

        Student1 st3=new Student1("piu", 21);
        st3.disp();
    }
}