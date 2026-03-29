
package Problem5;
public class Runner
{
    public static void main(String[] args) {
        Library item1 = new Book(1, "Java", "James");
        Library item2 = new Magazine(2, "Tech Today", "Editor");
        Library item3 = new DVD(3, "Movie", "Director");

        item1.getItemDetails();
        System.out.println("Loan Days: " + item1.getLoanDuration());

        item2.getItemDetails();
        System.out.println("Loan Days: " + item2.getLoanDuration());

        item3.getItemDetails();
        System.out.println("Loan Days: " + item3.getLoanDuration());

        ((Reservable)item1).reserveItem();
        ((Reservable)item2).reserveItem();
    }
}