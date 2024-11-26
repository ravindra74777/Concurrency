package Interface.V1;

public class FastStagRecharge {
    boolean recharge(BankAPi bankAPI, double amount){
        if (amount <= bankAPI.balanceCheck("")) {
            System.out.println("FastTag Recharge has done successfully");
            return true;
            }
         return false;
    }
}
