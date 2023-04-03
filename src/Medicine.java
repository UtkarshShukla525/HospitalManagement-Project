import java.util.Scanner;

interface Medical{
    void findMedicine();
    void newMedicine();
}
public class Medicine implements Medical{
    String med_name,med_company,med_expiry;
    int med_cost,med_count;
    @Override
    public void findMedicine() {
        System.out.println(med_name+"\t"+med_company+"\t"+med_cost+"\t"+med_count+"\t"+med_expiry);
    }

    @Override
    public void newMedicine() {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nmedicine name:- ");
        med_name=sc.nextLine();
        System.out.print("\ncompany:- ");
        med_company=sc.nextLine();
        System.out.print("\nexpiry date:- ");
        med_expiry=sc.nextLine();
        System.out.print("\ncounting:- ");
        med_count=sc.nextInt();
        System.out.print("\ncost:- ");
        med_cost=sc.nextInt();
    }
}
