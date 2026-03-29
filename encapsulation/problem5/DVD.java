package Problem5;
class DVD extends Library
{
    public DVD(int id, String title, String author)
    {
        super(id, title, author);
    }
    public int getLoanDuration()
    {
        return 3;
    }
}
