import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Operations inter = new Operations();
        int atmnumber = 45;
        int atmpin = 45;
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to the Atm Machine");
        System.out.print("Enter ATM number : ");
        int atmNumber = in.nextInt();
        System.out.print("Enter Pin : ");
        int pin = in.nextInt();
        if ((atmnumber == atmNumber) && (atmpin ==pin)){
            while (true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit\n");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                if (ch==1){
                    inter.viewBalance();
                }
                else if (ch==2){
                    System.out.println("Enter Amount to Withdraw: ");
                    double withdrawAmount=in.nextInt();
                    inter.withdrawAmount(withdrawAmount);
                }
                else if (ch==3){
                    System.out.println("Enter Amount to Deposit : ");
                    double depositAmount=in.nextInt();
                    inter.depositAmount(depositAmount);
                }
                else if (ch==4){
                    System.out.println("Collect Your Atm Card\nThank You for using Atm Machine\n");
                    System.exit(0);
                }
                else{
                    System.out.println("Please Enter Correct Choice !!!");
                }
            }
        }
        else {
            System.out.println("Incorrect Atm Number or Pin !!");
        }
    }
}