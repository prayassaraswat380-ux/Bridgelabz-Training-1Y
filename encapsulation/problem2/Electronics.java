package Problem2;
class Electronics extends Product implements Tax {
    public Electronics(int id, String name, double price)
    {
        super(id, name, price);
    }
    public double calculateDiscount()
    {
        return getPrice() * 0.1;
    }
    public double calculateTax()
    {
        return getPrice() * 0.18;
    }
    public String getTaxDetails()
    {
        return "Electronics Tax 18%";
    }
    public double getTax()
    {
        return calculateTax();
    }
}
