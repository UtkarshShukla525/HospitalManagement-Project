import java.util.Scanner;

interface PatientDetails{
    void patientInfo();
    void newPatient();
}
public class Patient implements PatientDetails{
    String patientName,disease,gender,admitStatus;
    int age,patientId;

    @Override
    public void patientInfo() {
        System.out.println(patientId+"\t"+patientName+"\t"+disease+"\t"+gender+"\t"+admitStatus+"\t"+age);
    }

    @Override
    public void newPatient() {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nid:- ");
        patientId=sc.nextInt();
        sc.nextLine();
        System.out.print("\nname:- ");
        patientName=sc.nextLine();
        System.out.print("\ndisease:- ");
        disease=sc.nextLine();
        System.out.print("\ngender:- ");
        gender= sc.nextLine();
        System.out.print("\nadmit status:- ");
        admitStatus=sc.nextLine();
        System.out.print("\nage:- ");
        age=sc.nextInt();
    }
}
