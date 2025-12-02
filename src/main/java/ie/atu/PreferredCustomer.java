package ie.atu;

public class PreferredCustomer extends Customer
{
    private int loyaltyPoints;
    private double discountLevel;

    public int getLoyaltyPoints()
    {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints)
    {
        this.loyaltyPoints = loyaltyPoints;
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
}
