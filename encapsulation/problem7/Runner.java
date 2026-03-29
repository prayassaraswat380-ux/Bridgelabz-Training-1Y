
package Problem7;

public class Runner
{
    public static void main(String[] args)
    {

        Patient p1 = new InPatient(1, "Krishna", 19);
        Patient p2 = new OutPatient(2, "Shivam", 20);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());

        ((MedicalRecord)p1).addRecord("Surgery Done");
        ((MedicalRecord)p2).addRecord("General Checkup");

        ((MedicalRecord)p1).viewRecords();
        ((MedicalRecord)p2).viewRecords();
    }
}