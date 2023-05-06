import java.util.Scanner;
class Services{

    Scanner sc = new Scanner(System.in);
    public void appointment(){
        System.out.println("----------------------------------------------");
        System.out.println("You can take appointment from any doctor");
        System.out.println("-----------------------------------------------");
        System.out.println("Enter 1 - For DOCTOR Tanmay (Child Specialist)");
        System.out.println("Enter 2 - For DOCTOR Shivani (Gynaecologist)");
        System.out.println("Enter 3 - For DOCTOR Gyandeep (Cardiologist)");
        System.out.println("Enter 4 - For DOCTOR Shriti (Dentist)");
        System.out.println("Enter 5 - For DOCTOR Shreya (Radiologist)");

        int value1 = sc.nextInt();

        if (value1 == 1){
            System.out.println("***********************************************************");
            System.out.println("Appointment Booked Successfully");
            System.out.println("You Booked a Appointment With Dr. Tanmay(Child Specialist)");
            System.out.println("Timing is 11 AM ** Please be on time ");
            System.out.println("---------------------------------------------");
            System.out.println("                   THANK YOU");
            System.out.println("---------------------------------------------");
            System.out.println("***********************************************************");

        }else if (value1 == 2){
            System.out.println("***********************************************************");
            System.out.println("Appointment Booked Successfully");
            System.out.println("You Booked a Appointment With Dr. Shivani (Gynaecologist)");
            System.out.println("Timing is 10 AM ** Please be on time ");
            System.out.println("---------------------------------------------");
            System.out.println("                   THANK YOU");
            System.out.println("---------------------------------------------");
            System.out.println("***********************************************************");

        }else if (value1 == 3){
            System.out.println("***********************************************************");
            System.out.println("Appointment Booked Successfully");
            System.out.println("You Booked a Appointment With Dr. Gyandeep (Cardiologist)");
            System.out.println("Timing is 10:55 AM ** Please be on time ");
            System.out.println("---------------------------------------------");
            System.out.println("                   THANK YOU");
            System.out.println("---------------------------------------------");
            System.out.println("***********************************************************");

        }else if (value1 == 4){
            System.out.println("***********************************************************");
            System.out.println("Appointment Booked Successfully");
            System.out.println("You Booked a Appointment With Dr. shriti (Dentist)");
            System.out.println("Timing is 10:45 AM ** Please be on time ");
            System.out.println("---------------------------------------------");
            System.out.println("                   THANK YOU");
            System.out.println("---------------------------------------------");
            System.out.println("***********************************************************");

        }else if (value1 == 5){
            System.out.println("***********************************************************");
            System.out.println("Appointment Booked Successfully");
            System.out.println("You Booked a Appointment With Dr. Shreya (Radiologist)");
            System.out.println("Timing is 10:15 AM ** Please be on time ");
            System.out.println("---------------------------------------------");
            System.out.println("                   THANK YOU");
            System.out.println("---------------------------------------------");
            System.out.println("***********************************************************");
        }else {
            System.out.println("Please Enter valid Number");
        }
    }

    public void Laboratory(){
        System.out.println("In lab");
    }

    public void MedicalStore(){
        System.out.println("In med");
    }
}
public class MAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String UserId = "Tanmay";
        String password = "Tanmay@123";

        System.out.println("              -----------------------");
        System.out.println("              WELCOME TO MAX HOSPITAL");
        System.out.println("              ------------------------");
        System.out.println();
        System.out.println("If you Don't have user id and password you have to register first");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("              ************** X ***********");
        System.out.println("               Please Enter your user ID");

        String UserId1 = sc.next();

        System.out.println();
        System.out.println("                 Please Enter password");

        String password1 = sc.next();

        if(UserId1.equals(UserId) && password1.equals(password)){

            System.out.println();
            System.out.println("Login Successfully ** We Are Available 24/7, Please Select Any Option");
            System.out.println();
            System.out.println("Enter 1 - For Appointment");
            System.out.println("Enter 2 - For Laboratory Services");
            System.out.println("Enter 3 - For Medical Store Service");
            int value = sc.nextInt();
            Services obj = new Services();
            if (value == 1){
                obj.appointment();
            }else if (value == 2){
                obj.Laboratory();
            } else if (value == 3) {
                obj.MedicalStore();
            }else {
                System.out.println("*********************************************");
                System.out.println("Invalid Input *** Please Enter Correct Number");
                System.out.println("---------------------------------------------");
                System.out.println("                   THANK YOU");
                System.out.println("---------------------------------------------");
            }
        }
        else {
            System.out.println("Please Enter correct password");
        }
    }
}
