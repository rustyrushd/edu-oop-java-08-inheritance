package ie.atu;

public class Main
{
    public static void main(String[] args)
    {
        Person firstPerson = new Person();
        firstPerson.setName("Jeff");
        firstPerson.setAddress("Jeff's Island");
        firstPerson.setPhoneNumber("123456");

        System.out.println(firstPerson);
    }
}