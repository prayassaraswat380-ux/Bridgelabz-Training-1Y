package Problem7;
class InPatient extends Patient implements MedicalRecord
{
    private String record;
    public InPatient(int id, String name, int age)
    {
        super(id, name, age);
    }
    public double calculateBill()
    {
        return 5000;
    }
    public void addRecord(String record)
    {
        this.record = record;
    }
    public void viewRecords()
    {
        System.out.println(record);
    }
}
