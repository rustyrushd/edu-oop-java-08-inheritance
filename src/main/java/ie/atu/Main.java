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

        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Tim", "Timmy Town", "1234", 2, true);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(customer1);
        System.out.println(customer2);
    }
}