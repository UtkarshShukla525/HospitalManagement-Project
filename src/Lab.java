import java.util.Scanner;

interface Facility{
    void newFacility();
    void showFacility();
}
public class Lab implements Facility{
    String lab_name;
    int lab_cost;

    @Override
    public void showFacility() {
        System.out.println(lab_name+"\t"+lab_cost);
    }

    @Override
    public void newFacility() {
        Scanner sc=new Scanner(System.in);
        System.out.println("lab name:- ");
        lab_name=sc.nextLine();
        System.out.println("lab cost: -");
        lab_cost=sc.nextInt();
    }
}
