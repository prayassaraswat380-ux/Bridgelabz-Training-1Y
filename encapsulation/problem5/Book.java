package Problem5;
class Book extends Library implements Reservable
{
    private boolean available = true;
    public Book(int id, String title, String author)
    {
        super(id, title, author);
    }
    public int getLoanDuration()
    {
        return 14;
    }
    public void reserveItem()
    {
        if (available) {
            available = false;
            System.out.println("Book reserved");
        } else {
            System.out.println("Not available");
        }
    }
    public boolean checkAvailability()
    {
        return available;
    }
}