package ie.atu;

public class CustomerTest
{
    public static void main(String[] args)
    {
        Customer customer1 = new Customer("Tim", "Timmy Town", "1800-TIM", 2, true);
        Customer customer2 = new Customer();
        customer2.setName("Jim");
        customer2.setAddress("Jimmy Town");
        customer2.setPhoneNumber("1800-JIM");
        customer2.setCustomerNumber(3);
        customer2.setMailingList(false);

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
