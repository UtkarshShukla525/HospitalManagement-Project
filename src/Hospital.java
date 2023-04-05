import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("                     WELCOME TO HOSPITAL MANAGEMENT SYSTEM                               ");
        System.out.println("\n---------------------------------------------------------------------------------------");

        ArrayList<Doctor> doctors=new ArrayList<>();
        Doctor d1=new Doctor();
        d1.doctorId = 21;
        d1.doctorName= "Dr.Ghanendra";
        d1.specialist = "ENT";
        d1.availableTime= "5-11AM";
        d1.qualification= "MBBS,MD";
        d1.roomNumber = 17;
        Doctor d2=new Doctor();
        d2.doctorId = 32;
        d2.doctorName = "Dr.Vikram";
        d2.specialist = "Physician";
        d2.availableTime = "10-3AM";
        d2.qualification = "MBBS,MD";
        d2.roomNumber = 45;
        Doctor d3=new Doctor();
        d3.doctorId = 17;
        d3.doctorName = "Dr.Rekha";
        d3.specialist = "Surgeon";
        d3.availableTime = "8-2AM";
        d3.qualification = "BDM";
        d3.roomNumber = 8;
        Doctor d4=new Doctor();
        d4.doctorId = 33;
        d4.doctorName = "Dr.Pramod";
        d4.specialist = "Artho";
        d4.availableTime = "10-4PM";
        d4.qualification = "MBBS,MS";
        d4.roomNumber = 40;
        doctors.add(d1);
        doctors.add(d2);
        doctors.add(d3);
        doctors.add(d4);

        ArrayList<Patient> patients=new ArrayList<>();
        Patient p1=new Patient();
        Patient p2=new Patient();
        Patient p3=new Patient();
        Patient p4=new Patient();
        p1.patientId = 12;
        p1.patientName = "Pankaj";
        p1.disease = "Cancer";
        p1.gender = "Male";
        p1.admitStatus = "y";
        p1.age = 30;
        p2.patientId = 13;
        p2.patientName = "Sumit";
        p2.disease = "Cold";
        p2.gender = "Male";
        p2.admitStatus = "y";
        p2.age = 23;
        p3.patientId = 14;
        p3.patientName = "Alok";
        p3.disease = "Maleriya";
        p3.gender = "Male";
        p3.admitStatus = "y";
        p3.age = 45;
        p4.patientId = 15;
        p4.patientName = "Ravi";
        p4.disease = "Diabetes";
        p4.gender = "Male";
        p4.admitStatus = "y";
        p4.age = 25;
        patients.add(p1);
        patients.add(p2);
        patients.add(p3);
        patients.add(p4);

        ArrayList<Medicine> medicines=new ArrayList<>();
        Medicine m1=new Medicine();
        Medicine m2=new Medicine();
        Medicine m3=new Medicine();
        Medicine m4=new Medicine();
        m1.med_name = "Corex";
        m1.med_company = "Cino pvt";
        m1.med_expiry = "9-5-16";
        m1.med_cost = 55;
        m1.med_count = 8;
        m2.med_name = "Nytra";
        m2.med_company = "Ace pvt";
        m2.med_expiry = "4-4-15";
        m2.med_cost = 500;
        m2.med_count = 5;
        m3.med_name = "Brufa";
        m3.med_company = "Reckitt";
        m3.med_expiry = "12-7-17";
        m3.med_cost = 50;
        m3.med_count = 56;
        m4.med_name = "Pride";
        m4.med_company = "DDF pvt";
        m4.med_expiry = "12-4-12";
        m4.med_cost = 1100;
        m4.med_count = 100;
        medicines.add(m1);
        medicines.add(m2);
        medicines.add(m3);
        medicines.add(m4);

        ArrayList<Staff> staffs=new ArrayList<>();
        Staff s1=new Staff();
        Staff s2=new Staff();
        Staff s3=new Staff();
        Staff s4=new Staff();
        s1.staff_id = 22;
        s1.staff_name = "Prakash";
        s1.designation = "Worker";
        s1.gender = "Male";
        s1.salary = 5000;
        s2.staff_id = 23;
        s2.staff_name = "Komal";
        s2.designation = "Nurse";
        s2.gender = "Female";
        s2.salary = 2000;
        s3.staff_id = 24;
        s3.staff_name = "Raju";
        s3.designation = "Worker";
        s3.gender = "Male";
        s3.salary = 5000;
        s4.staff_id = 25;
        s4.staff_name = "Rani";
        s4.designation = "Nurse";
        s4.gender = "Female";
        s4.salary = 20000;
        staffs.add(s1);
        staffs.add(s2);
        staffs.add(s3);
        staffs.add(s4);

        ArrayList<Lab> labs=new ArrayList<>();
        Lab l1=new Lab();
        Lab l2=new Lab();
        Lab l3=new Lab();
        Lab l4=new Lab();
        l1.lab_name = "X-ray     ";
        l1.lab_cost = 800;
        l2.lab_name = "CT Scan   ";
        l2.lab_cost = 1200;
        l3.lab_name = "OR Scan   ";
        l3.lab_cost = 500;
        l4.lab_name = "Blood Bank";
        l4.lab_cost = 50;
        labs.add(l1);
        labs.add(l2);
        labs.add(l3);
        labs.add(l4);

        Scanner sc=new Scanner(System.in);
        int status=1,choice,c1,c12,c2,c22,c3,c32,c4,c42,c5,c52;
        while (status==1){
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("                              ** MAIN MENU **                                      ");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.DOCTORS   2.PATIENTS   3.MEDICINES   4.STAFFS   5.LABS");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Enter the choice from above field");
            choice=sc.nextInt();
            switch (choice){

                case 1:{
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("                      ** DOCTORS SECTION **");
                    System.out.println("-----------------------------------------------------------------------------------");
                    c1=1;
                    while(c1==1) {
                        System.out.println("1.Add new entry\t2.Existing doctors list");
                        c12=sc.nextInt();
                        if(c12==1){
                            Doctor d=new Doctor();
                            d.newDoctor();
                            doctors.add(d);
                        }
                        else if(c12==2){
                            System.out.println("Id\tName\tQualification\tSpecialist\tAvailableTime\tRoomNo.");
                            Iterator itr=doctors.iterator();
                            while(itr.hasNext()){
                                Doctor d=(Doctor) itr.next();
                                d.doctorInfo();
                            }
                        }
                        else {
                            System.out.println("You have entered wrong choice");
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        c1=sc.nextInt();
                    }
                    break;
                }
                case 2:{
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("                      ** PATIENTS SECTION **");
                    System.out.println("-----------------------------------------------------------------------------------");
                    c2=1;
                    while(c2==1){
                        System.out.println("1.Add new entry\t2.Existing doctors list");
                        c22=sc.nextInt();
                        if(c22==1){
                            Patient p=new Patient();
                            p.newPatient();
                            patients.add(p);
                        }
                        else if(c22==2){
                            System.out.println("Id\tName\tDisease\tGender\tAdmitStatus\tAge");
                            Iterator itr=patients.iterator();
                            while(itr.hasNext()){
                                Patient p=(Patient) itr.next();
                                p.patientInfo();
                            }
                        }else {
                            System.out.println("You have entered wrong choice");
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        c2=sc.nextInt();
                    }
                    break;
                }
                case 3:{
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("                      ** MEDICINE SECTION **");
                    System.out.println("-----------------------------------------------------------------------------------");
                    c3=1;
                    while(c3==1){
                        System.out.println("1.Add new entry\t2.Existing doctors list");
                        c32=sc.nextInt();
                        if(c32==1){
                            Medicine m=new Medicine();
                            m.newMedicine();
                            medicines.add(m);
                        }
                        else if(c32==2){
                            System.out.println("Medicine Name\tCompany\tCost\tQuantity\tExpiry date");
                            Iterator itr=medicines.iterator();
                            while(itr.hasNext()){
                                Medicine m=(Medicine) itr.next();
                                m.findMedicine();
                            }
                        }
                        else {
                            System.out.println("You have entered wrong choice");
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        c3=sc.nextInt();
                    }
                    break;
                }
                case 4:{
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("                      ** STAFF SECTION **");
                    System.out.println("-----------------------------------------------------------------------------------");
                    c4=1;
                    while (c4==1){
                        System.out.println("1.Add new entry\t2.Existing doctors list");
                        c42=sc.nextInt();
                        if(c42==1){
                            Staff s=new Staff();
                            s.newStaff();
                            staffs.add(s);

                        }
                        else if(c42==2){
                            System.out.println("Id\tStaff Name\tDesignation\tGender\tSalary");
                            Iterator itr=staffs.iterator();
                            while(itr.hasNext()){
                                Staff s=(Staff) itr.next();
                                s.staffInfo();
                            }
                        }else {
                            System.out.println("You have entered wrong choice");
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        c4=sc.nextInt();
                    }
                    break;
                }
                case 5:{
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("                      ** LABS SECTION **");
                    System.out.println("-----------------------------------------------------------------------------------");
                    c5=1;
                    while(c5==1) {
                        System.out.println("1.Add new entry\t2.Existing doctors list");
                        c52=sc.nextInt();
                        if(c52==1){
                            Lab l=new Lab();
                            l.newFacility();
                            labs.add(l);
                        }
                        else if(c52==2){
                            System.out.println("Lab Name\tLab Cost");
                            Iterator itr=labs.iterator();
                            while(itr.hasNext()){
                                Lab l =(Lab) itr.next();
                                l.showFacility();
                            }
                        }else {
                            System.out.println("You have entered wrong choice");
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        c5=sc.nextInt();
                    }
                    break;
                }
                default:{
                    System.out.println("You have entered wrong choice");
                }
            }
            System.out.println("\nReturn to MAIN MENU press 1");
            status=sc.nextInt();
        }

    }
}
