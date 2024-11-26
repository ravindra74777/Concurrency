package Interface.V1;

public class PhonePeLoan {
    public  boolean checkEligibility(BankAPi bankAPI, double amount){
        if(bankAPI.balanceCheck("") > .2 * amount){
           System.out.println("Loan will be available");
           return true;
        }
        return false;
     }
  }

