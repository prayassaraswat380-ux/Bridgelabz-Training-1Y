package Problem2;
abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int id, String name, double price)
    {
        this.productId = id;
        this.name = name;
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract double calculateDiscount();
    public void display()
    {
        double finalPrice = price + getTax() - calculateDiscount();
        System.out.println(name + " Final Price: " + finalPrice);
    }
    public double getTax()
    {
        return 0;
    }
}