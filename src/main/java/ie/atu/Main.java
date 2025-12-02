package ie.atu;

public class Main
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        Person person2 = new Person();
        person2.setName("Jeff");
        person2.setAddress("Jeff's Island");
        person2.setPhoneNumber("123456");

        System.out.println(person1);
        System.out.println(person2);
    }
}