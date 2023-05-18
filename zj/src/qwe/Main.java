package qwe;
public class Main
{
    public static void main(String args[])
    {
        Length length = new Length();
        length.setName("java");
        length.setAge(12);

        System.out.println(length.ShuchuName());
    }
}
class Length
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String ShuchuName()
    {
        return "名字为"+name+"年龄为"+age;
    }
}