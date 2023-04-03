import java.util.Scanner;

interface StaffDetails{
    void staffInfo();
    void newStaff();
}
public class Staff implements StaffDetails{
    String staff_name, designation, gender;
    int salary,staff_id;
    @Override
    public void staffInfo() {
        System.out.println(staff_id+"\t"+staff_name+"\t"+designation+"\t"+gender+"\t"+salary);
    }

    @Override
    public void newStaff() {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nid:- ");
        staff_id=sc.nextInt();
        sc.nextLine();
        System.out.print("\nname:- ");
        staff_name=sc.nextLine();
        System.out.print("\ndesignation:- ");
        designation=sc.nextLine();
        System.out.print("\ngender:- ");
        gender=sc.nextLine();
        System.out.print("\nsalary:- ");
        salary=sc.nextInt();

    }
}
