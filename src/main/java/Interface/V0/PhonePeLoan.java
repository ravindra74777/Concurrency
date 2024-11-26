package Interface.V0;

public class PhonePeLoan {
    public  boolean checkEligibility(YesBankAPI yesBankAPI, double amount){
        if(yesBankAPI.checkBalance("") > .2* amount){
           System.out.println("Loan will be available");
           return true;
        }
        return false;
     }
  }

