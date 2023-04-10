
import java.util.*;
class Atmcode{
    public static void main(String[] args) {
        int cash = 0;
        int cont = 1;
        int total_am = 500000;
        int res = total_am;
        int accNo = 4326020;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your card and press 1");
        int a = sc.nextInt();
        System.out.println("-----------------------------------------------------------");
        int choice = 1;
        if (a == 1) {
            while (choice==1) {
                System.out.println("Press w for withdrawl");
                System.out.println("Press m for ministatement");
                System.out.println("Press b for balance enquiry");
                System.out.println("-------------------------------------------------------");
                System.out.println("enter the option");
                String ch = sc.next();
                System.out.println("---------------------------------------------------");
                switch(ch){
                    case "w":
                        System.out.println("Enter your pin");
                        int pin = sc.nextInt();
                        if(pin == 5678){
                            System.out.println("-----------------------------------");
                            System.out.println("Welcome to SBI atm");
                            
                           while(cont == 1){
                                System.out.println("enter the amount");
                                cash = sc.nextInt();
                                System.out.println("do you want to print the reciept, press 1 for yes");
                                int receipt = sc.nextInt();
                                if (receipt == 1) {
                                    System.out.println("---------------------------------------------------");
                                    System.out.println("acc/no.: " + accNo + " accHol: GOVIND YADAV");
                                    res = res - cash;
                                    System.out.println("amount withdrew: " + cash);
                                    System.out.println("current amount: " + res);
                                    System.out.println("Thank you for using The atm");
                                }
                                else {
                                    System.out.println("Thank you for using the atm");
                                }
                                System.out.println("---------------------------------------");
                               System.out.println("do you want to continue, press 1 for yes:");
                                cont = sc.nextInt();
                                
                            }
                        }
                        else{
                            System.out.println("password is wrong, remove your card");
                            break;
                        }
                        break;
                        
                        case "m":
                            System.out.println("accHol: GOVIND YADAV " );
                            System.out.println("accNo: "+ accNo);
                            System.out.println("Balance: " + res);
                            System.out.println("deducted amount: " + cash);
                            break;
                        case "b":
                        System.out.println("Your current balance is: "+ res);
                        break;
                }
                System.out.println("-----------------------------------------------");
                   System.out.println("press 1 to go to the main menu and 0 to exit");
                   choice = sc.nextInt();
            }
        }
    }
}