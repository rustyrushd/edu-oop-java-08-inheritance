package ie.atu;

public class PreferredCustomerTest
{
    public static void main(String[] args)
    {
        PreferredCustomer pc = new PreferredCustomer();
        pc.setName("Billy Boy Jeff");
        pc.setAddress("Jeff's Island");
        pc.setPhoneNumber("1800-JEFF");
        pc.setCustomerNumber(3);
        pc.setMailingList(true);
        System.out.println(pc);

        pc.addLoyaltyPoints(700);
        System.out.println(pc);

        pc.addLoyaltyPoints(800);
        System.out.println(pc);
    }
}
