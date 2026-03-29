package Problem1;
class PartTimeEmployee extends Employee implements Department
{
    private int hours;
    private String department;
    public PartTimeEmployee(int id, String name, double salary, int hours)
    {
        super(id, name, salary);
        this.hours = hours;
    }
    public double calculateSalary()
    {
        return getBaseSalary() * hours;
    }
    public void assignDepartment(String dept)
    {
        department = dept;
    }
    public String getDepartmentDetails()
    {
        return department;
    }
}