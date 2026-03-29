package Problem2;


    class Clothing extends Product implements Tax
    {
        public Clothing(int id, String name, double price)
        {
            super(id, name, price);
        }
        public double calculateDiscount()
        {
            return getPrice() * 0.2;
        }
        public double calculateTax()
        {
            return getPrice() * 0.05;
        }
        public String getTaxDetails()
        {
            return "Clothing Tax 5%";
        }
        public double getTax()
        {
            return calculateTax();
        }
    }

