package ie.atu;

public class PreferredCustomer extends Customer
{
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer()
    {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0.0;
    }

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList,
                             int loyaltyPoints)
    {
        super(name, address,phoneNumber,customerNumber,mailingList);
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel(loyaltyPoints);
    }

    private void updateDiscountLevel(int loyaltyPoints)
    {
        if (loyaltyPoints < 500) {
            this.discountLevel = 0.00;
        } else if (loyaltyPoints < 1000) {
            this.discountLevel = 0.05;
        } else if (loyaltyPoints < 1500) {
            this.discountLevel = 0.06;
        } else if (loyaltyPoints < 2000) {
            this.discountLevel = 0.07;
        } else {
            this.discountLevel = 0.10;
        }
    }

    public int getLoyaltyPoints()
    {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints)
    {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel(loyaltyPoints);
    }

    public double getDiscountLevel()
    {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel)
    {
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString()
    {
        return super.toString() + " loyaltyPoints=" + loyaltyPoints
            + ", discountLevel=" + discountLevel;
    }

    public void addLoyaltyPoints(int points) {
        setLoyaltyPoints(getLoyaltyPoints() + points);
    }
}
