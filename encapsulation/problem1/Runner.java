package Problem1;
public class Runner {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(1, "Krishna", 400000);
        Employee e2 = new PartTimeEmployee(2, "Gaurav", 20000, 5);

        ((Department)e1).assignDepartment("IT");
        ((Department)e2).assignDepartment("HR");

        e1.displayDetails();
        e2.displayDetails();
    }
}
