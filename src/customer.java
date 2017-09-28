import java.util.Random;

/**
 * Created by Charlie on 28/09/2017.
 */
public class customer {

    public int accountNumber;
    public int accountPin;
    public String firstName;
    public String secondName;
    public int availableFunds;

    public void assignCustomerDetails(String userFirstName, String userSecondName){
        firstName = userFirstName;
        secondName = userSecondName;
        generateAccountNumber();
    }

    public void generateAccountNumber(){
        util u = new util();
        Random rnd = new Random();
        int n = 80000000 + rnd.nextInt(9000000);
        u.printOut("| Account Number is " + n + " |");
        u.lineOut();
        accountNumber = n;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getAccountPin(){
        return accountPin;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public int getAvailableFunds(){
        return availableFunds;
    }

}
