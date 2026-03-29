package Problem7;
class OutPatient extends Patient implements MedicalRecord
{
    private String record;
    public OutPatient(int id, String name, int age)
    {
        super(id, name, age);
    }
    public double calculateBill()
    {
        return 500;
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