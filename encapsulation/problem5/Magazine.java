package Problem5;
class Magazine extends Library implements Reservable
{
    private boolean available = true;
    public Magazine(int id, String title, String author)
    {
        super(id, title, author);
    }
    public int getLoanDuration()
    {
        return 7;
    }
    public void reserveItem()
    {
        available = false;
        System.out.println("Magazine reserved");
    }
    public boolean checkAvailability()
    {
        return available;
    }
}