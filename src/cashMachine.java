import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Charlie on 27/09/2017.
 */
public class cashMachine {

    private util u = new util();

    //Main for class.
    public static void main(String[] args) {
        cashMachine c = new cashMachine();
        c.mainScreen();
       // c.dataValidation(c);
    }

    public void mainScreen(){
        u.bankBanner();
        u.printOut("| WHAT WOULD YOU LIKE TO DO? |");
        u.lineOut();
        u.printOut("|     1 - Open an Account    |");
        u.printOut("|     2 - Close an Account   |");
        u.printOut("|     3 - Check Funds        |");
        u.printOut("|     4 - Withdraw Funds     |");
        u.lineOut();
        openAccount();
    }

    public void dataValidation(cashMachine c){
        int acceptedAccountNumber = inputInt("What is your account number?");
        int acceptedPinNumber = inputInt("What is your pin?");

    }

    public void openAccount(){
        customer customer = new customer();
       u.bankBanner();
       customer.assignCustomerDetails("Charlie","Say");
    }

    public static int inputInt(String prompt) {
        Scanner atmScanner = new Scanner(System.in);
        System.out.println(prompt);
        util u = new util();
        try{
            atmScanner.close();
            return atmScanner.nextInt();
        } catch (InputMismatchException e){
            u.printOut("Input Mismatch! Please enter Numbers.");
            atmScanner.next();
            return inputInt(prompt);
        }
    }

//    public void checkAccount(String userInput) {
//        boolean checkAccount = false;
//        while (checkAccount == false) {
//            if ((userInput.length() == 8)) {
//                acceptedAccountNumber = inputInt(userInput);
//
////                try {
////                    double d = Double.parseDouble(userInput);
////                    int accountNumber = (int) d;
////                    acceptedAccountNumber = accountNumber;
////                    if (accountNumber() == true){
////                        System.out.println("Accepted Account Number aswell.");
////                        askforPin(acceptedAccountNumber);
////                    }else{
////                    }
////                    break;
////                } catch (NumberFormatException nfe) {
////                    System.out.println("Account Number must only contain numbers.");
////                    break;
////                }
//            } else {
//                System.out.println("ERROR : Account Number must \n Be 8 digits long \n Contain only numbers");
//
//                break;
//            }
//        }
//    }


}
