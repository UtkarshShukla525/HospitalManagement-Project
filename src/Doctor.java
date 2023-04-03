import java.util.Scanner;

interface DoctorDetails{
    void newDoctor();
    void doctorInfo();
}
public class Doctor implements DoctorDetails{
    String doctorName,specialist,availableTime,qualification;
    int doctorId,roomNumber;
    @Override
    public void doctorInfo() {
        System.out.println(doctorId+"\t"+doctorName+"\t"+qualification+"\t"+specialist+"\t"+availableTime+"\t"+roomNumber);
    }

    @Override
    public void newDoctor() {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nid:- ");
        doctorId=sc.nextInt();
        sc.nextLine();
        System.out.print("\nname:- ");
        doctorName=sc.nextLine();
        System.out.println("\nqualification:- ");
        qualification=sc.nextLine();
        System.out.println("\nspecialization:- ");
        specialist=sc.nextLine();
        System.out.println("\nappointment timing:- ");
        availableTime=sc.nextLine();
        System.out.println("\nroom number:- ");
        roomNumber=sc.nextInt();
    }
}
